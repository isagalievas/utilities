package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.UserReceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReceiptRepository extends JpaRepository<UserReceipt, Long> {
    UserReceipt findByPersonalAccountReceipt(String personalAccountReceipt);
}
