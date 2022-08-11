package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.Region;
import kg.itacademy.utilities.model.RegionModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RegionMapper {
    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);

    Region toEntity(RegionModel regionModel);

    RegionModel toModel(Region region);

    List<RegionModel> toRegionModels(List<Region> regionList);
}
