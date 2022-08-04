package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.Address;
import kg.itacademy.utilities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
