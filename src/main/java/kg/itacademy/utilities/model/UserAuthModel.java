package kg.itacademy.utilities.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;


@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserAuthModel {
    @NotBlank(message = "Login can't be blank")
    String login;

    @NotBlank(message = "Password can't be blank")
    String password;
}
