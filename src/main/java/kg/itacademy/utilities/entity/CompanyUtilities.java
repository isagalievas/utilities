package kg.itacademy.utilities.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "company_utilities")
@Getter
@Setter
public class CompanyUtilities extends BaseEntity {
    @Column(name = "name_of_company", nullable = false)
    private String nameOfCompany;

    @ManyToOne
    @JoinColumn(name = "category_utilities_id", nullable = false)
    private CategoryUtilities categoryUtilities;
}
