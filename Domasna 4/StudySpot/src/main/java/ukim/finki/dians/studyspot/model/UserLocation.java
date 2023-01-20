package ukim.finki.dians.studyspot.model;

import lombok.Data;

@Data
public class UserLocation {

    private double latitude;
    private double longitude;

    public UserLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
