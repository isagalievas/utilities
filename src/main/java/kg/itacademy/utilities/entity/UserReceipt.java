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
@Table(name = "user_receipt")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserReceipt extends BaseEntity {
    @JoinColumn(name = "region_id", nullable = false)
    Region region;

    @JoinColumn(name = "city_id", nullable = false)
    City city;

    @Column(name = "address_receipt")
    String addressReceipt;

    @JoinColumn(name = "category_utilities_id", nullable = false)
    CategoryUtilities categoryUtilities;

    @JoinColumn(name = "company_utilities_id", nullable = false)
    CompanyUtilities companyUtilities;

    @Column(name = "personal_account_receipt", nullable = false)
    String personalAccountReceipt;
}
