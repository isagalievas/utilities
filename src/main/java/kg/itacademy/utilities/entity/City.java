package kg.itacademy.utilities.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Getter
@Setter
public class City extends BaseEntity {
    @Column(name = "city_name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "region_id")
    Region region;
}
