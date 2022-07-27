package kg.itacademy.utilities.controller;

import kg.itacademy.utilities.model.UserAuthModel;
import kg.itacademy.utilities.model.UserModel;
import kg.itacademy.utilities.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/user")
public class UserController {
    final UserService userService;

    @PostMapping(path = "/sign-in")
    public String getAuthToken(@Valid @RequestBody UserAuthModel userAuthDto) {
        return userService.getToken(userAuthDto);
    }

    @PostMapping("/sign-up")
    public String register(@Valid @RequestBody UserModel userModel) {
        return userService.createUser(userModel);
    }
}
