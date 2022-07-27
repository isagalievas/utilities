package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.Receipt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReceiptRepository extends CrudRepository<Receipt, Long> {
    List<Receipt> findAllByPersonalAccount(Long personalAccount);
}
