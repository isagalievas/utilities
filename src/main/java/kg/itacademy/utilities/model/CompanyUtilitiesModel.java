package kg.itacademy.utilities.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompanyUtilitiesModel {
    Long id;
    String nameOfCompany;
    Long categoryUtilitiesId;
}
