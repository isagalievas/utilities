package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user_utilities")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {
    @Column(name = "login", nullable = false)
    String login;

    @Column(name = "password", nullable = false)
    String password;

    @Email
    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "region", nullable = false)
    String region;

    @Column(name = "city", nullable = false)
    String city;

    //адресс указанное в квитанции
    @Column(name = "address", nullable = false)
    String address;

    //фио указанное в квитанции
    @Column(name = "full_name", nullable = false)
    String fullName;

    @ManyToOne
    Receipt receipts;

    @Column(name = "is_active")
    Boolean isActive;
}
