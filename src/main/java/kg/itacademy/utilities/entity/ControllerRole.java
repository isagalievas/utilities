package kg.itacademy.utilities.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "")
public class ControllerRole extends BaseEntity {
    @JoinColumn(name = "controller_id", nullable = false)
    Controller controller;

    @JoinColumn(name = "role_id", nullable = false)
    Role role;
}
