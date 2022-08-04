package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address extends BaseEntity {

    @Column(name = "address_name", nullable = false)
    String name;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    Region region;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    City city;//rayon

}
