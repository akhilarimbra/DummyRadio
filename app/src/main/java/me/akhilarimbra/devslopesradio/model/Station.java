package me.akhilarimbra.devslopesradio.model;

/**
 * Created by akhilraj on 29/10/16.
 */

public class Station {

    private String stationTitle;
    private String imageURI;

    final String DRAWABLE = "drawable/";

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImageURI() {
        return DRAWABLE + imageURI;
    }

    public Station(String stationTitle, String imageURI) {
        this.stationTitle = stationTitle;
        this.imageURI = imageURI;
    }
}
