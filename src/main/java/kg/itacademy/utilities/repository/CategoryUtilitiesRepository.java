package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.CategoryUtilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryUtilitiesRepository extends JpaRepository<CategoryUtilities, Long> {
}
