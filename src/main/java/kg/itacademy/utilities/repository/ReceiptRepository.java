package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
    @Query(nativeQuery = true, value = "SELECT\n" +
            "\tr.*\n" +
            "FROM\n" +
            "\treceipt r\n" +
            "WHERE\n" +
            "\tr.personal_account_receipt = :personalAccountNumber\n" +
            "\tAND r.discharged = :discharged")
    List<Receipt> findAllByPersonalAccountNumberAndByDischarged(@Param("personalAccountNumber") String personalAccountNumber,
                                                                @Param("discharged") LocalDate discharged);
}
