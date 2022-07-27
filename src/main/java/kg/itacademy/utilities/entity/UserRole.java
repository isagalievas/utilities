package kg.itacademy.utilities.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "users_roles")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRole extends BaseEntity {
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @JoinColumn(name = "role_id", nullable = false)
    Role role;
}
