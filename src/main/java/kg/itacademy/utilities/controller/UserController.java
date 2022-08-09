package kg.itacademy.utilities.controller;

import kg.itacademy.utilities.model.UserAuthModel;
import kg.itacademy.utilities.model.UserModel;
import kg.itacademy.utilities.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/user")
@CrossOrigin(origins = "*", maxAge = 8600)
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserController {
    final UserService userService;

    @PostMapping(path = "/sign-in")
    public String getAuthToken(@Valid @RequestBody UserAuthModel userAuthDto) {
        return userService.getToken(userAuthDto);
    }

    @PostMapping(path = "/sign-up")
    public String register(@Valid @RequestBody UserModel userModel) {
        return userService.createUser(userModel);
    }
}
