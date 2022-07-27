package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "region")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region extends BaseEntity {
    @Column(name = "region_name", nullable = false)
    String name;

    @JoinColumn(name = "city_id", nullable = false)
    City city;
}
