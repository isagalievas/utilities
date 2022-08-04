package kg.itacademy.utilities.controller;


import kg.itacademy.utilities.model.UserReceiptAuthModel;
import kg.itacademy.utilities.model.UserTokenResponse;
import kg.itacademy.utilities.service.UserReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/user")
public class UserReceiptController {

    private final UserReceiptService userReceiptService;

    @PostMapping(path = "/sign-in")
    public UserTokenResponse getAuthToken(@Valid @RequestBody UserReceiptAuthModel userReceiptAuthModel) {
        return userReceiptService.getToken(userReceiptAuthModel);
    }
}
