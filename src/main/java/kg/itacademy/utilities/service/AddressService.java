package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.AddressModel;

public interface AddressService {
    AddressModel addAddress(AddressModel addressModel);

    AddressModel getById(Long id);

    boolean deleteAddress(Long id);
}
