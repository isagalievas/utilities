package kg.itacademy.utilities.controller;

import kg.itacademy.utilities.entity.Role;
import kg.itacademy.utilities.model.RoleModel;
import kg.itacademy.utilities.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", maxAge = 8600)
@RequestMapping("/api/role")
public class RoleController {
    final RoleRepository roleRepository;

    @PostMapping("/create")
    public String createRole(@RequestBody RoleModel roleModel) {
        Role role = new Role();
        role.setNameRole(roleModel.getNameRole());
        return roleRepository.save(role).getNameRole();
    }
}
