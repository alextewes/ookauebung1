package org.bonn.ooka.buchungssystem.ss2022;

import java.util.HashMap;
import java.util.List;

public class HotelRetrieval implements HotelSuche {
    private final DBAccess dbAccess;
    private final Cache cache;

    public HotelRetrieval(Cache cache) {
        this.dbAccess = new DBAccess();
        this.cache = cache;
    }

    @Override
    public List<Hotel> getHotelsByName(String name) {
        List<Hotel> hotels = dbAccess.getHotels(0, name);
        cache.cacheResult(name, hotels);
        return hotels;
    }
    @Override
    public void openSession() {
        dbAccess.openConnection();
    }
    @Override
    public void closeSession() {
        dbAccess.closeConnection();
    }

}
