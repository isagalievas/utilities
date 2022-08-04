package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.ReceiptModel;

import java.util.List;

public interface ControllerService {
    ReceiptModel addReceipt(ReceiptModel receiptModel);

    List<ReceiptModel> getAllReceipt();

    boolean deleteReceipt(Long id);
}
