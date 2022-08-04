package kg.itacademy.utilities.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category_utilities")
@Getter
@Setter
public class CategoryUtilities extends BaseEntity {
    @Column(name = "name_of_category", nullable = false)
    private String nameOfCategory;
}
