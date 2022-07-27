package kg.itacademy.utilities.service.Impl;

import kg.itacademy.utilities.entity.Receipt;
import kg.itacademy.utilities.mapper.ReceiptMapper;
import kg.itacademy.utilities.model.ReceiptModel;
import kg.itacademy.utilities.repository.ReceiptRepository;
import kg.itacademy.utilities.service.ReceiptService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptRepository receiptRepository;

    @Override
    public ReceiptModel addReceipt(ReceiptModel receiptModel) {
        Receipt receipt = new Receipt();
        return ReceiptMapper.INSTANCE.toModel(receipt);
    }

    @Override
    public List<ReceiptModel> viewReceipt(Long personalAccount) {
        List<Receipt> receiptList = receiptRepository.findAllByPersonalAccount(personalAccount);
        return ReceiptMapper.INSTANCE.toReceiptModels(receiptList);
    }

    @Override
    public boolean deleteReceipt(Long id) {
        receiptRepository.deleteById(id);
        return true;
    }
}
