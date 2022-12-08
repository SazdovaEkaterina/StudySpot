package ukim.finki.dians.studyspot.bootstrap;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ukim.finki.dians.studyspot.model.Spot;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Spot> spots = new ArrayList<>();

    @PostConstruct
    public void init(){

    }

}
