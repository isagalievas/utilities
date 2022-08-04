package kg.itacademy.utilities.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users_roles")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRole extends BaseEntity {
    @JoinColumn(name = "user_receipt_id", nullable = false)
    UserReceipt userReceipt;

    @JoinColumn(name = "role_id", nullable = false)
    Role role;
}
