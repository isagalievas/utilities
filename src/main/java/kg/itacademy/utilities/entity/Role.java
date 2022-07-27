package kg.itacademy.utilities.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "utilities_roles")
public class Role extends BaseEntity {
    @Column(name = "name_role", nullable = false, unique = true)
    private String nameRole;
}