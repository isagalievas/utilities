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
@Table(name = "address")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address extends BaseEntity {
    @Column(name = "address_name", nullable = false)
    String name;

    @JoinColumn(name = "region_id", nullable = false)
    Region region;
}
