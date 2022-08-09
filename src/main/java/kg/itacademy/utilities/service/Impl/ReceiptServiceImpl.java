package kg.itacademy.utilities.service.Impl;

import kg.itacademy.utilities.entity.CompanyUtilities;
import kg.itacademy.utilities.entity.Receipt;
import kg.itacademy.utilities.mapper.ReceiptMapper;
import kg.itacademy.utilities.model.ReceiptModel;
import kg.itacademy.utilities.repository.CategoryUtilitiesRepository;
import kg.itacademy.utilities.repository.CompanyUtilitiesRepository;
import kg.itacademy.utilities.repository.ReceiptRepository;
import kg.itacademy.utilities.service.ReceiptService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@AllArgsConstructor
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptRepository receiptRepository;

    @Autowired
    private CategoryUtilitiesRepository categoryUtilitiesRepository;

    @Autowired
    private CompanyUtilitiesRepository companyUtilitiesRepository;

    @Override
    public ReceiptModel addReceipt(ReceiptModel receiptModel) {
        Receipt receiptEntity = ReceiptMapper.INSTANCE.toEntity(receiptModel);
        CompanyUtilities companyUtilities = companyUtilitiesRepository.findById(receiptModel.getCompanyUtilitiesId()).orElseThrow();
        receiptEntity.setCompanyUtilities(companyUtilities);
        receiptEntity = receiptRepository.save(receiptEntity);
        receiptModel.setId(receiptEntity.getId());
        return receiptModel;
    }

    @Override
    public List<ReceiptModel> getAllReceiptByPersonalNumberAndByDischarged(String personalAccountNumber, LocalDate discharged) {
        return ReceiptMapper.INSTANCE.toReceiptModels(receiptRepository.findAllByPersonalAccountNumberAndByDischarged(personalAccountNumber,discharged));
    }

    @Override
    public List<ReceiptModel> getAllReceipt() {
        List<Receipt> receiptEntityList = receiptRepository.findAll();
        return ReceiptMapper.INSTANCE.toReceiptModels(receiptEntityList);
    }

    @Override
    public boolean deleteReceipt(Long id) {
        receiptRepository.deleteById(id);
        return true;
    }
}