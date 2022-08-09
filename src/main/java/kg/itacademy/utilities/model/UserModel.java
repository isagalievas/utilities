package kg.itacademy.utilities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {
    @NotBlank
    String login;

    @NotBlank
    String password;

    @NotBlank
    String email;
}
