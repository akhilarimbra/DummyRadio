package me.akhilarimbra.devslopesradio.services;

import java.util.ArrayList;

import me.akhilarimbra.devslopesradio.model.Station;

/**
 * Created by akhilraj on 29/10/16.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations() {
        // Pretend that we just downloaded featured stations from the station

        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Flight Plan (Tunes for travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheenlin (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));

        return list;
    }
    public ArrayList<Station> getRecentStations() {
        // Pretend that we just downloaded featured stations from the station

        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Recent Kids Jams (Music for Children)", "kidsmusic"));
        list.add(new Station("Recent Flight Plan (Tunes for travel)", "flightplanmusic"));
        list.add(new Station("Recent Two-Wheenlin (Biking Playlist)", "bicyclemusic"));

        return list;
    }

    public ArrayList<Station> getPartyStations() {
        // Pretend that we just downloaded featured stations from the station

        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Party Flight Plan (Tunes for travel)", "flightplanmusic"));
        list.add(new Station("Party Two-Wheenlin (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Party Kids Jams (Music for Children)", "kidsmusic"));

        return list;
    }

}
