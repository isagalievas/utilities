package kg.itacademy.utilities.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@Table(name = "")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Controller extends BaseEntity {
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
