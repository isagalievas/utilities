package kg.itacademy.utilities.service.Impl;

import kg.itacademy.utilities.model.UserReceiptAuthModel;
import kg.itacademy.utilities.model.UserTokenResponse;
import kg.itacademy.utilities.repository.UserReceiptRepository;
import kg.itacademy.utilities.service.UserReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;


@Service
@RequiredArgsConstructor
public class UserReceiptServiceImpl implements UserReceiptService {

    private final UserReceiptRepository userReceiptRepository;

    @Override
    public UserTokenResponse getToken(UserReceiptAuthModel userReceiptAuthModel) {

        return UserTokenResponse.builder().token(generateToken(userReceiptAuthModel)).build();
    }

    private String generateToken(UserReceiptAuthModel userReceiptAuthModel) {
        return Arrays.toString(Base64
                .getEncoder()
                .encode((userReceiptAuthModel.getAddressReceipt() + ":" + userReceiptAuthModel.getPersonalAccountReceipt()).getBytes(StandardCharsets.UTF_8)));
    }
}
