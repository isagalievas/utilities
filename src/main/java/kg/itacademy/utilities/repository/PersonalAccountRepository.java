package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.PersonalAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalAccountRepository extends JpaRepository<PersonalAccount, Long> {
}
