package kg.itacademy.utilities.controller;


import kg.itacademy.utilities.model.PersonalAccountModel;
import kg.itacademy.utilities.service.PersonalAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/personal/account")
public class PersonalAccountController {

    @Autowired
    PersonalAccountService personalAccountService;

    @PostMapping(path = "/add")
    public ResponseEntity<PersonalAccountModel> addNewPersonalAccount(@RequestBody PersonalAccountModel personalAccountModel) {
        PersonalAccountModel result = personalAccountService.addPersonalAccountNumber(personalAccountModel);
        if (result.getId() != null) {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(result);
        } else {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
