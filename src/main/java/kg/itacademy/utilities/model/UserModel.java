package kg.itacademy.utilities.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserModel {
    @NotBlank
    String login;

    @NotBlank
    String password;

    @Email
    @NotBlank
    String email;

    @NotBlank
    String region;

    @NotBlank
    String city;

    @NotBlank
    String address;

    @NotBlank
    String fullName;
}
