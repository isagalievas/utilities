package kg.itacademy.utilities.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT t.address_receipt, t.personal_account_receipt FROM user_receipt t WHERE t.addressReceipt = ?")
                .authoritiesByUsernameQuery(
                        "SELECT u.address_receipt, r.name_role " +
                                "FROM users_roles ur " +
                                "INNER JOIN user_receipt u " +
                                "   on ur.user_id = u.id " +
                                "INNER JOIN utilities_roles r " +
                                "   on ur.role_id = r.id " +
                                "WHERE u.address_receipt = ?"
                );
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .csrf().disable()
                .cors().disable()
                .authorizeRequests()

                .antMatchers(HttpMethod.GET, "/api/dictionary/*").hasRole("USER")

                .antMatchers(HttpMethod.POST, "/api//api/personal/account/*").hasRole("USER")

                .antMatchers(HttpMethod.GET, "/api/receipt/get-all").hasAnyRole("USER", "CONTROLLER")
                .antMatchers(HttpMethod.POST, "/api/receipt/add").hasRole("CONTROLLER")
                .antMatchers(HttpMethod.DELETE, "/api/receipt/delete").hasRole("CONTROLLER")

                .antMatchers("/api/address/*").hasRole("USER")

                .antMatchers("/api/controller/*").hasRole("CONTROLLER")

                .and()
                .httpBasic();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
