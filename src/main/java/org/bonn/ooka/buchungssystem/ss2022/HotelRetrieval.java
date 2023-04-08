package org.bonn.ooka.buchungssystem.ss2022;

import java.util.List;

public class HotelRetrieval implements HotelSuche {


    private DBAccess dbAccess;

    public HotelRetrieval() {
        dbAccess = new DBAccess();
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        dbAccess.openConnection();
        // List<String> result = dbAccess.getObjects(DBAccess.HOTEL, name);
        dbAccess.closeConnection();
        return new Hotel[0];
    }

    @Override
    public void openSession() {

    }
}
