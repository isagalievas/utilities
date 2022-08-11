package kg.itacademy.utilities.controller;

import kg.itacademy.utilities.model.ReceiptModel;
import kg.itacademy.utilities.service.ReceiptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/receipt")
public class ReceiptController {

    @Autowired
    ReceiptService receiptService;

    @GetMapping(path = "/getAllByPersonalNumberAndByDischarged")
    public ResponseEntity<List<ReceiptModel>> getAllPersonalNumberAndByDischarged(@RequestParam("personalAccountNumber") String personalAccountNumber,
                                                                                  @RequestParam("discharged") LocalDate discharged) {
        try {
            return ResponseEntity.ok(receiptService.getAllReceiptByPersonalNumberAndByDischarged(personalAccountNumber, discharged));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
