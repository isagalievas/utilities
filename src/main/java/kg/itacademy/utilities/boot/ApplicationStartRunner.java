package kg.itacademy.utilities.boot;

import kg.itacademy.utilities.entity.Role;
import kg.itacademy.utilities.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ApplicationStartRunner implements CommandLineRunner {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        Role roleUser = new Role();
        roleUser.setName("ROLE_USER");
        Role roleController = new Role();
        roleController.setName("ROLE_CONTROLLER");
        roleRepository.save(roleUser);
        roleRepository.save(roleController);
    }
}
