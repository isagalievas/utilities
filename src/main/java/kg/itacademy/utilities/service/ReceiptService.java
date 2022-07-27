package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.ReceiptModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReceiptService {
    ReceiptModel addReceipt(ReceiptModel receiptModel);

    List<ReceiptModel> viewReceipt(Long personalAccount);

    boolean deleteReceipt(Long id);
}
