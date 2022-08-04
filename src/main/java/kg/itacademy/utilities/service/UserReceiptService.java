package kg.itacademy.utilities.service;

import kg.itacademy.utilities.entity.UserReceipt;
import kg.itacademy.utilities.model.UserReceiptAuthModel;
import kg.itacademy.utilities.model.UserTokenResponse;

public interface UserReceiptService {
    UserTokenResponse getToken(UserReceiptAuthModel userReceiptAuthModel);
}
