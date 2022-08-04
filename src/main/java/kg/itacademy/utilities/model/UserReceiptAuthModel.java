package kg.itacademy.utilities.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;


@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserReceiptAuthModel {
    @NotBlank
    String personalAccountReceipt;

    @NotBlank
    String addressReceipt;
}
