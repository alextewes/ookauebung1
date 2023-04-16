package org.bonn.ooka.buchungssystem.ss2022;

import java.util.List;

public interface HotelSuche {
    public List<Hotel> getHotelsByName(String name);

    // public Hotel getHotelById(int id);

    public void openSession();

    public void closeSession();
}
