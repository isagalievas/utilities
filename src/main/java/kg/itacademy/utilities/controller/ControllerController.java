package kg.itacademy.utilities.controller;


import kg.itacademy.utilities.model.ReceiptModel;
import kg.itacademy.utilities.service.ReceiptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/controller")
public class ControllerController {
    @Autowired
    ReceiptService receiptService;

    @PostMapping(path = "/add")
    public ResponseEntity<ReceiptModel> addNewReceipt(@RequestBody ReceiptModel receiptModel) {
        ReceiptModel result = receiptService.addReceipt(receiptModel);
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

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<ReceiptModel>> getReceiptAll() {
        try {
            return ResponseEntity.ok(receiptService.getAllReceipt());
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<Boolean> deleteReceipt(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(receiptService.deleteReceipt(id));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
