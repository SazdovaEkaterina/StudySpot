package ukim.finki.dians.studyspot.model;

import lombok.Data;

@Data
public class Spot {

    private long id;
    private double latitude;
    private double longitude;
    private String name;
    private String location;
    private String amenity;
    private String opening_hours;

    public Spot(long id, double latitude, double longitude, String name, String location, String amenity, String opening_hours) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.location = location;
        this.amenity = amenity;
        this.opening_hours = opening_hours;
    }
}
