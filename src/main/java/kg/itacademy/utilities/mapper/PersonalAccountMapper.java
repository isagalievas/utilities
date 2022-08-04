package kg.itacademy.utilities.mapper;

import kg.itacademy.utilities.entity.PersonalAccount;
import kg.itacademy.utilities.model.PersonalAccountModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonalAccountMapper {
    PersonalAccountMapper INSTANCE = Mappers.getMapper(PersonalAccountMapper.class);

    PersonalAccount toEntity(PersonalAccountModel personalAccountModel);

    PersonalAccountModel toModel(PersonalAccount personalAccount);

    List<PersonalAccountModel> toPersonalAccountModels(List<PersonalAccount> personalAccountList);

}
