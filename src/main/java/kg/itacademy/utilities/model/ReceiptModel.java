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
    //выписано
    LocalDate discharged;
    //оплатить до
    LocalDate payUpTo;
    //лицевой счёт)
    String personalAccountNumber;
    //название компании
    Long companyUtilitiesId;//выборка
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
