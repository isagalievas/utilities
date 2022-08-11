package kg.itacademy.utilities.service.Impl;

import kg.itacademy.utilities.entity.Address;
import kg.itacademy.utilities.entity.City;
import kg.itacademy.utilities.entity.Region;
import kg.itacademy.utilities.exceptions.AddressNotFoundException;
import kg.itacademy.utilities.mapper.AddressMapper;
import kg.itacademy.utilities.model.AddressModel;
import kg.itacademy.utilities.repository.AddressRepository;
import kg.itacademy.utilities.repository.CityRepository;
import kg.itacademy.utilities.repository.RegionRepository;
import kg.itacademy.utilities.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CityRepository cityRepository;


    @Autowired
    private RegionRepository regionRepository;

    @Override
    public AddressModel addAddress(AddressModel addressModel) {
        Address addressEntity = new Address();
        addressEntity.setName(addressModel.getName());
        City city = cityRepository.findById(addressModel.getCityId()).orElseThrow();
        addressEntity.setCity(city);
        Region region = regionRepository.findById(addressModel.getRegionId()).orElseThrow();
        addressEntity.setRegion(region);
        addressEntity = addressRepository.save(addressEntity);
        addressModel.setId(addressEntity.getId());
        return addressModel;
    }

    @Override
    public AddressModel getById(Long id) {
        if (id == null) {
            throw new InvalidParameterException("ID is null");
        }
        Address address = addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException("address not found by id: " + id));
        return AddressMapper.INSTANCE.toModel(address);
    }

    @Override
    public boolean deleteAddress(Long id) {
        addressRepository.deleteById(id);
        return true;
    }
}

