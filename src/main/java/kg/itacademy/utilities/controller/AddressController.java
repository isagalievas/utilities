package kg.itacademy.utilities.controller;

import kg.itacademy.utilities.model.AddressModel;
import kg.itacademy.utilities.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(path = "/add")
    public ResponseEntity<AddressModel> addNewAddress(@RequestBody AddressModel addressModel) {
        AddressModel result = addressService.addAddress(addressModel);
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

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<AddressModel> getAddressById(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(addressService.getById(id));
        } catch (RuntimeException ex) {
            log.error(ex.getMessage(), ex);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<Boolean> deleteAddress(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(addressService.deleteAddress(id));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
