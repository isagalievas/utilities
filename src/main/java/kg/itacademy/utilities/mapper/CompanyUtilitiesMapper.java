package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.CompanyUtilities;
import kg.itacademy.utilities.model.CompanyUtilitiesModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CompanyUtilitiesMapper {
    CompanyUtilitiesMapper INSTANCE = Mappers.getMapper(CompanyUtilitiesMapper.class);

    CompanyUtilities toEntity(CompanyUtilitiesModel companyUtilitiesModel);

    CompanyUtilitiesModel toModel(CompanyUtilities companyUtilities);

    List<CompanyUtilitiesModel> toCompanyUtilitiesModels(List<CompanyUtilities> companyUtilitiesList);
}
