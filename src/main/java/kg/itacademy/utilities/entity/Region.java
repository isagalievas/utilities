package kg.itacademy.utilities.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "region")
@Getter
@Setter
public class Region extends BaseEntity {
    @Column(name = "region_name", nullable = false)
    private String name;
}
