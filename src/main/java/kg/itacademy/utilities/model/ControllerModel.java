package kg.itacademy.utilities.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ControllerModel {
    @NotBlank
    String login;

    @NotBlank
    String password;

    @Email
    @NotBlank
    String email;
}
