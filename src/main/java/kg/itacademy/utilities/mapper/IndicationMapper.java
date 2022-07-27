package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.Indication;
import kg.itacademy.utilities.entity.Receipt;
import kg.itacademy.utilities.model.IndicationModel;
import kg.itacademy.utilities.model.ReceiptModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IndicationMapper {
    IndicationMapper INSTANCE = Mappers.getMapper(IndicationMapper.class);

    Indication toEntity(IndicationModel indicationModel);

    IndicationModel toModel(Indication indication);

    List<IndicationModel> toIndicationModels(List<Indication> indicationList);
}
