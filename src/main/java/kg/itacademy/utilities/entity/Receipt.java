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
    //выписано
    @Column(name = "discharged", nullable = false)
    LocalDate discharged;
    //оплатить до
    @Column(name = "pay_up_to", nullable = false)
    LocalDate payUpTo;
    //лицевой счёт
    @Column(name = "personal_account_receipt", nullable = false)
    String personalAccountNumber;
    //название компании
    @ManyToOne
    @JoinColumn(name = "company_utilities_id", nullable = false)
    CompanyUtilities companyUtilities;//выборка
    //номер для связи
    @Column(name = "contact_number", nullable = false)
    String contactNumber;
    //переплата
    @Column(name = "overpayment", nullable = false)
    Double overpayment;
    //недоплата
    @Column(name = "underpayment", nullable = false)
    Double underpayment;
    //пеня
    @Column(name = "fine", nullable = false)
    Double fine;
    @Column(name = "to_pay", nullable = false)
    //к оплате
    Double toPay;
}
