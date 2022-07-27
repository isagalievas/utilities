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
public class IndicationModel {
    Long id;
    String fullNameOfPayer;
    String addressOfPayer;
    LocalDate dateOfIndication;
    Long indication;
}
