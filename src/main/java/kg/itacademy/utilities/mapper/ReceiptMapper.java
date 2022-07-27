package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.Receipt;
import kg.itacademy.utilities.model.ReceiptModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReceiptMapper {
    ReceiptMapper INSTANCE = Mappers.getMapper(ReceiptMapper.class);

    Receipt toEntity(ReceiptModel receiptModel);

    ReceiptModel toModel(Receipt receipt);

    List<ReceiptModel> toReceiptModels(List<Receipt> receiptList);
}
