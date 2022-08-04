package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.ControllerModel;
import org.springframework.stereotype.Service;
public interface AdminService {
    String createController(ControllerModel controllerModel);
}
