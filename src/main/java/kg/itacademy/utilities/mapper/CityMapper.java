package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.City;
import kg.itacademy.utilities.model.CityModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    City toEntity(CityModel cityModel);

    CityModel toModel(City city);

    List<CityModel> toCityModels(List<City> cityList);

}
