package ukim.finki.dians.studyspot.service;

import ukim.finki.dians.studyspot.model.Spot;

import java.util.List;

public interface SpotService {

    List<Spot> listAllSpots();

    Spot findById(String id);
}
