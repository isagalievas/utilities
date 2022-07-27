package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.UserAuthModel;
import kg.itacademy.utilities.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String getToken(UserAuthModel userAuthModel);

    String createUser(UserModel userAuthModel);
}
