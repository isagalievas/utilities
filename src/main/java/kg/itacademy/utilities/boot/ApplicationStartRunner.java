package kg.itacademy.utilities.boot;

import kg.itacademy.utilities.entity.Role;
import kg.itacademy.utilities.model.UserModel;
import kg.itacademy.utilities.repository.RoleRepository;
import kg.itacademy.utilities.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


public class ApplicationStartRunner implements CommandLineRunner {
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {

        Role roleController = new Role();
        roleController.setName("ROLE_CONTROLLER");
        roleRepository.save(roleController);

        userService.createUser(UserModel.builder()
                .login("Controller")
                .password("Controller1")
                .build());
    }
}
