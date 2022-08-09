package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.UserAuthModel;
import kg.itacademy.utilities.model.UserModel;

public interface UserService {
    String getToken(UserAuthModel userAuthDto);

    String createUser(UserModel userAuthDto);
}
