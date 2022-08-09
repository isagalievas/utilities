package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findFirstByName(String name);
}
