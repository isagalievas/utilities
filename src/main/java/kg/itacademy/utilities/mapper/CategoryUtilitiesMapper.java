package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.CategoryUtilities;
import kg.itacademy.utilities.model.CategoryUtilitiesModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryUtilitiesMapper {
    CategoryUtilitiesMapper INSTANCE = Mappers.getMapper(CategoryUtilitiesMapper.class);

    CategoryUtilities toEntity(CategoryUtilitiesModel categoryUtilitiesModel);

    CategoryUtilitiesModel toModel(CategoryUtilities categoryUtilities);

    List<CategoryUtilitiesModel> toCategoryUtilitiesModels(List<CategoryUtilities> categoryUtilitiesList);
}
