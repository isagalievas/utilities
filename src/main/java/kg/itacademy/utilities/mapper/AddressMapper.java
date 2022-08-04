package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.Address;
import kg.itacademy.utilities.model.AddressModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address toEntity(AddressModel addressModel);

    AddressModel toModel(Address addressEntity);

    List<AddressModel> toAddressModels(List<Address> addressList);
}
