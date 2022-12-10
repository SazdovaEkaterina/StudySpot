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
        spots.add(new Spot(5298107134L,42.0040209,21.3978977,"Internet Cafe",null,"internet_cafe", null));
        spots.add(new Spot(529345345L,42.0087564,21.3972435,"Cafe1",null,"cafe", "Mon-Fri"));
        spots.add(new Spot(12345L,42.0049567,21.39745645,"La Biblioteka",null,"library", null));
        spots.add(new Spot(5845656343L,42.0040645,21.3978975,"Cafe2",null,"cafe", null));
    }

}
