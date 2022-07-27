package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.Indication;
import kg.itacademy.utilities.entity.Receipt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IndicationRepository extends CrudRepository<Indication, Long> {
    List<Indication> findAllByPersonalAccount(Long personalAccount);
}
