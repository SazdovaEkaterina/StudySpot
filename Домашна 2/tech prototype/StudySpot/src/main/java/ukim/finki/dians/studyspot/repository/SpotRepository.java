package ukim.finki.dians.studyspot.repository;

import org.springframework.stereotype.Repository;
import ukim.finki.dians.studyspot.model.Spot;

import java.util.List;

import static ukim.finki.dians.studyspot.bootstrap.DataHolder.spots;

@Repository
public class SpotRepository {

    public List<Spot> listAllSpots() {
        return spots;
    }

    public Spot findById(long spot_id) {
        return spots.stream()
                .filter(s -> s.getId() == (spot_id))
                .findFirst().get();
    }

}
