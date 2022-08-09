package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "personal_account")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonalAccount extends BaseEntity {
    @Column(name = "personal_account_number", nullable = false)
    String personalAccountNumber;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    Address address;

    @ManyToOne
    @JoinColumn(name = "company_utilities_id", nullable = false)
    CompanyUtilities companyUtilities;
}
