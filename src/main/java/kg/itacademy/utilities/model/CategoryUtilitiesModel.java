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
public class CategoryUtilitiesModel {
    Long id;
    String nameOfCategory;
}

