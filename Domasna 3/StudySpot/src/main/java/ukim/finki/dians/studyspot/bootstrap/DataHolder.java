package ukim.finki.dians.studyspot.bootstrap;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ukim.finki.dians.studyspot.model.Spot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Spot> spots = new ArrayList<>();

    @PostConstruct
    public void init() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\Ekaterina\\Documents\\Stuff\\fakultet\\semestar 5\\dizajn i arhitektura na softver\\StudySpot\\StudySpot\\Домашна 1\\studyspots.csv"));
        bufferedReader.readLine();
        String line = bufferedReader.readLine();
        while (line != null) {
            String[] attributes = line.split(",");
            long id = 0;
            double lat = 0.0;
            double lon = 0.0;
            String name = null;
            String location = null;
            String amenity = null;
            String opening_hours = null;
            if (attributes.length >= 1) {
                id = Long.valueOf(attributes[0]);
            }
            if (attributes.length >= 2) {
                lat = Double.valueOf(attributes[1]);
            }
            if (attributes.length >= 3) {
                lon = Double.valueOf(attributes[2]);
            }
            if (attributes.length >= 4) {
                name = attributes[3];
            }
            if (attributes.length >= 5) {
                location = attributes[4];
            }
            if (attributes.length >= 6) {
                amenity = attributes[5];
            }
            if (attributes.length >= 7) {
                opening_hours = attributes[6];
            }
            if (amenity != null) {
                spots.add(new Spot(id, lat, lon, name, location, amenity, opening_hours));
            }
            line = bufferedReader.readLine();
        }
    }

}
