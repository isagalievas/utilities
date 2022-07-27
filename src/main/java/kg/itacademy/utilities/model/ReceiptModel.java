package kg.itacademy.utilities.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReceiptModel {
    Long id;
    String nameOfReceipt;
    LocalDate discharged;
    LocalDate payUpTo;
    String addressOfPayer;
    String fullNameOfPayer;
    Long personalAccount;
    String city;
    String nameOfCompany;
    String contactNumber;
    Double overpayment;
    Double underpayment;
    Double fine;
    Double toPay;
}
