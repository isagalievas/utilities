package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.Controller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ControllerRepository extends JpaRepository<Controller, Long> {
}
