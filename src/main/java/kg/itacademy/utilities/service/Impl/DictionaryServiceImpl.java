package kg.itacademy.utilities.service.Impl;

import kg.itacademy.utilities.entity.CategoryUtilities;
import kg.itacademy.utilities.entity.City;
import kg.itacademy.utilities.entity.CompanyUtilities;
import kg.itacademy.utilities.entity.Region;
import kg.itacademy.utilities.model.CategoryUtilitiesModel;
import kg.itacademy.utilities.model.CityModel;
import kg.itacademy.utilities.model.CompanyUtilitiesModel;
import kg.itacademy.utilities.model.RegionModel;
import kg.itacademy.utilities.repository.CategoryUtilitiesRepository;
import kg.itacademy.utilities.repository.CityRepository;
import kg.itacademy.utilities.repository.CompanyUtilitiesRepository;
import kg.itacademy.utilities.repository.RegionRepository;
import kg.itacademy.utilities.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private CompanyUtilitiesRepository companyUtilitiesRepository;

    @Autowired
    private CategoryUtilitiesRepository categoryUtilitiesRepository;

    @Override
    public List<RegionModel> getAllRegion() {
        List<Region> regionList = regionRepository.findAll();
        return regionList.stream().map(region -> RegionModel.builder()
                .regionName(region.getName()).build()).collect(Collectors.toList());
    }

    @Override
    public List<CityModel> getAllCity() {
        List<City> cityList = cityRepository.findAll();
        return cityList.stream().map(city -> CityModel.builder()
                .cityName(city.getName()).build()).collect(Collectors.toList());
    }

    @Override
    public CompanyUtilitiesModel getAllByCategoryId(Long categoryUtilitiesId) {
        CompanyUtilities companyUtilities = companyUtilitiesRepository.findById(categoryUtilitiesId).orElseThrow();
        return CompanyUtilitiesModel.builder()
                .categoryUtilitiesId(companyUtilities.getCategoryUtilities().getId())
                .build();
    }

    @Override
    public List<CategoryUtilitiesModel> getAllCategories() {
        List<CategoryUtilities> categoryUtilitiesList = categoryUtilitiesRepository.findAll();
        return categoryUtilitiesList.stream().map(categoryUtilities -> CategoryUtilitiesModel.builder()
                .nameOfCategory(categoryUtilities.getNameOfCategory()).build()).collect(Collectors.toList());
    }
}
