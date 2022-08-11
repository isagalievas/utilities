package kg.itacademy.utilities.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
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
    LocalDate discharged;
    LocalDate payUpTo;
    String personalAccountNumber;
    Long companyUtilitiesId;
    String contactNumber;
    Double overpayment;
    Double underpayment;
    Double fine;
    Double toPay;
}
