package kg.itacademy.utilities.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonalAccountModel {
    @NotNull
    Long id;

    @NotBlank
    String personalAccountNumber;

    @NotNull
    Long addressId;

    @NotNull
    Long companyId;
}
