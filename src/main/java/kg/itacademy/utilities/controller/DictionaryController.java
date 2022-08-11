package kg.itacademy.utilities.controller;

import kg.itacademy.utilities.model.CategoryUtilitiesModel;
import kg.itacademy.utilities.model.CityModel;
import kg.itacademy.utilities.model.CompanyUtilitiesModel;
import kg.itacademy.utilities.model.RegionModel;
import kg.itacademy.utilities.service.DictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping(path = "/api/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping(path = "/region/getAll")
    public ResponseEntity<List<RegionModel>> getAllRegions() {
        try {
            return ResponseEntity.ok(dictionaryService.getAllRegion());
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @GetMapping(path = "/city/getAllByRegionId/{id}")
    public ResponseEntity<CityModel> getAllCities(@PathVariable("id") Long regionId) {
        try {
            return ResponseEntity.ok(dictionaryService.getAllByRegionId(regionId));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }


    @GetMapping(path = "/company/getAllByCategoryId/{id}")
    public ResponseEntity<CompanyUtilitiesModel> getAllCompaniesByCategoryId(@PathVariable("id") Long categoryUtilitiesId) {
        try {
            return ResponseEntity.ok(dictionaryService.getAllByCategoryId(categoryUtilitiesId));
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @GetMapping(path = "/category/getAll")
    public ResponseEntity<List<CategoryUtilitiesModel>> getAllCategories() {
        try {
            return ResponseEntity.ok(dictionaryService.getAllCategories());
        } catch (RuntimeException e) {
            log.error(e.getMessage(), e);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
