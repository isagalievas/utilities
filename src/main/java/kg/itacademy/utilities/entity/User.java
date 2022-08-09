package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "users")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {
    @Column(name = "login", nullable = false)
    String login;

    @Column(name = "password", nullable = false)
    String password;

    @Email
    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "is_active")
    Boolean isActive;

}
