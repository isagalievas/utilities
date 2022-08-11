package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.CompanyUtilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyUtilitiesRepository extends JpaRepository<CompanyUtilities, Long> {
}
