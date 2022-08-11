package kg.itacademy.utilities.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@Table(name = "controller")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Controller extends BaseEntity {
    @Column(name = "firstname", nullable = false)
    String firstname;

    @Column(name = "lastname", nullable = false)
    String lastname;

    @Email
    @Column(name = "contact_number", nullable = false)
    String contactNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
