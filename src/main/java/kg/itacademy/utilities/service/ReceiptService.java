package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.ReceiptModel;

import java.time.LocalDate;
import java.util.List;

public interface ReceiptService {
    ReceiptModel addReceipt(ReceiptModel receiptModel);

    List<ReceiptModel> getAllReceiptByPersonalNumberAndByDischarged(String personalAccountNumber, LocalDate discharged);

    List<ReceiptModel> getAllReceipt();

    boolean deleteReceipt(Long id);
}
