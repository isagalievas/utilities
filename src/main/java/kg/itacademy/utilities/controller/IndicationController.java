package kg.itacademy.utilities.controller;

import kg.itacademy.utilities.model.IndicationModel;
import kg.itacademy.utilities.service.IndicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/receipt")
public class IndicationController {

    @Autowired
    IndicationService indicationService;

    @PostMapping(path = "/add")
    public ResponseEntity<IndicationModel> addNewIndication(@RequestBody IndicationModel indicationModel) {
        IndicationModel result = indicationService.addIndication(indicationModel);
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

    @PutMapping(path = "/update")
    public ResponseEntity<IndicationModel> updateIndication(@RequestBody IndicationModel indicationModel) {
        try {
            indicationService.updateIndication(indicationModel);
            return ResponseEntity.ok(indicationService.updateIndication(indicationModel));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @GetMapping(path = "/viewIndication")
    public ResponseEntity<List<IndicationModel>> viewIndication(@RequestParam("personalAccount") Long personalAccount) {
        try {
            return ResponseEntity.ok(indicationService.viewIndication(personalAccount));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @GetMapping(path = "/delete")
    public ResponseEntity<Boolean> deleteIndication(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(indicationService.deleteIndication(id));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
