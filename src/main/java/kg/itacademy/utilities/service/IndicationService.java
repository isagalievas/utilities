package kg.itacademy.utilities.service;

import kg.itacademy.utilities.model.IndicationModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndicationService {
    IndicationModel addIndication(IndicationModel indicationModel);

    IndicationModel updateIndication(IndicationModel indicationModel);

    List<IndicationModel> viewIndication(Long personalAccount);

    boolean deleteIndication(Long id);
}
