package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "city")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City extends BaseEntity {
    @Column(name = "city_name", nullable = false)
    String name;

}
