package kg.itacademy.utilities.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "receipts")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Receipt extends BaseEntity {
    //наименование квитанции
    String nameOfReceipt;
    //выписано
    LocalDate discharged;
    //оплатить до
    LocalDate payUpTo;
    //адресс плательщика
    String addressOfPayer;
    //фио плательщика
    String fullNameOfPayer;
    //лицевой счёт
    Long personalAccount;
    //район
    String city;
    //название компании
    String nameOfCompany;
    //номер для связи
    String contactNumber;
    //переплата
    Double overpayment;
    //недоплата
    Double underpayment;
    //пеня
    Double fine;
    //к оплате
    Double toPay;
}
