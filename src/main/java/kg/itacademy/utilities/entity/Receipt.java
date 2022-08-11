package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "receipts")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Receipt extends BaseEntity {
    @Column(name = "discharged", nullable = false)
    LocalDate discharged;

    @Column(name = "pay_up_to", nullable = false)
    LocalDate payUpTo;

    @Column(name = "personal_account_receipt", nullable = false)
    String personalAccountNumber;

    @ManyToOne
    @JoinColumn(name = "company_utilities_id", nullable = false)
    CompanyUtilities companyUtilities;//выборка

    @Column(name = "contact_number", nullable = false)
    String contactNumber;

    @Column(name = "overpayment", nullable = false)
    Double overpayment;

    @Column(name = "underpayment", nullable = false)
    Double underpayment;

    @Column(name = "fine", nullable = false)
    Double fine;

    @Column(name = "to_pay", nullable = false)
    Double toPay;
}
