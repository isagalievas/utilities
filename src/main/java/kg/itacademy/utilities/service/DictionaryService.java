package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.CategoryUtilitiesModel;
import kg.itacademy.utilities.model.CityModel;
import kg.itacademy.utilities.model.CompanyUtilitiesModel;
import kg.itacademy.utilities.model.RegionModel;

import java.util.List;

public interface DictionaryService {

    List<RegionModel> getAllRegion();

    List<CityModel> getAllCity();

    CompanyUtilitiesModel getAllByCategoryId(Long categoryUtilitiesId);

    List<CategoryUtilitiesModel> getAllCategories();
}
