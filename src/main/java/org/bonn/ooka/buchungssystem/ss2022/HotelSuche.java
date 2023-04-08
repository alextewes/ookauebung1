package org.bonn.ooka.buchungssystem.ss2022;

public interface HotelSuche {
    public Hotel[] getHotelByName(String name);

    public void openSession();
}
