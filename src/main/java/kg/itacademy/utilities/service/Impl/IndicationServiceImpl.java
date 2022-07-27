package kg.itacademy.utilities.service.Impl;

import kg.itacademy.utilities.entity.Indication;
import kg.itacademy.utilities.exceptions.IndicationNotFoundException;
import kg.itacademy.utilities.mapper.IndicationMapper;
import kg.itacademy.utilities.model.IndicationModel;
import kg.itacademy.utilities.repository.IndicationRepository;
import kg.itacademy.utilities.service.IndicationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IndicationServiceImpl implements IndicationService {

    @Autowired
    private IndicationRepository indicationRepository;

    @Override
    public IndicationModel addIndication(IndicationModel indicationModel) {
        Indication indication = new Indication();
        return IndicationMapper.INSTANCE.toModel(indication);
    }

    @Override
    public IndicationModel updateIndication(IndicationModel indicationModel) {
        Indication existIndication = indicationRepository.findById(indicationModel.getId()).orElseThrow(() -> new IndicationNotFoundException("indication not found"));
        return IndicationMapper.INSTANCE.toModel(existIndication);

    }

    @Override
    public List<IndicationModel> viewIndication(Long personalAccount) {
        List<Indication> indicationList = indicationRepository.findAllByPersonalAccount(personalAccount);
        return IndicationMapper.INSTANCE.toIndicationModels(indicationList);
    }

    @Override
    public boolean deleteIndication(Long id) {
        indicationRepository.deleteById(id);
        return true;
    }
}
