package kg.itacademy.utilities.service.Impl;

import kg.itacademy.utilities.entity.*;
import kg.itacademy.utilities.model.PersonalAccountModel;
import kg.itacademy.utilities.repository.AddressRepository;
import kg.itacademy.utilities.repository.CompanyUtilitiesRepository;
import kg.itacademy.utilities.repository.PersonalAccountRepository;
import kg.itacademy.utilities.service.PersonalAccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonalAccountServiceImpl implements PersonalAccountService {
    @Autowired
    private PersonalAccountRepository personalAccountRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CompanyUtilitiesRepository companyUtilitiesRepository;

    @Override
    public PersonalAccountModel addPersonalAccountNumber(PersonalAccountModel personalAccountModel) {
        PersonalAccount personalAccountEntity = new PersonalAccount();
        personalAccountEntity.setPersonalAccountNumber(personalAccountEntity.getPersonalAccountNumber());
        Address address = addressRepository.findById(personalAccountModel.getAddressId()).orElseThrow();
        personalAccountEntity.setAddress(address);
        CompanyUtilities companyUtilities = companyUtilitiesRepository.findById(personalAccountModel.getCompanyId()).orElseThrow();
        personalAccountEntity.setCompanyUtilities(companyUtilities);
        personalAccountEntity = personalAccountRepository.save(personalAccountEntity);
        personalAccountModel.setId(personalAccountEntity.getId());
        return personalAccountModel;
    }
}
