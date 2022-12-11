package ukim.finki.dians.studyspot.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.dians.studyspot.model.Spot;
import ukim.finki.dians.studyspot.repository.SpotRepository;
import ukim.finki.dians.studyspot.service.SpotService;

import java.util.List;

@Service
public class SpotServiceImpl implements SpotService {

    private final SpotRepository spotRepository;

    public SpotServiceImpl(SpotRepository spotRepository) {
        this.spotRepository = spotRepository;
    }

    @Override
    public List<Spot> listAllSpots() {
        return spotRepository.listAllSpots();
    }

    @Override
    public Spot findById(String id) {
        return spotRepository.findById(Long.parseLong(id));
    }

    @Override
    public Spot generateRandom() {
        return spotRepository.generateRandom();
    }
}
