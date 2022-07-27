package kg.itacademy.utilities.repository;

import kg.itacademy.utilities.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findFirstByNameRole(String nameRole);
}
