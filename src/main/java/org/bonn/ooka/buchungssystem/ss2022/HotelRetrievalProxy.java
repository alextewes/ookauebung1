package org.bonn.ooka.buchungssystem.ss2022;

public class HotelRetrievalProxy {

    private final HotelSuche hotelRetrieval;

    public HotelRetrievalProxy() {
        this.hotelRetrieval = new HotelRetrieval();
    }

    public Hotel[] getHotelByName(String name) {
        // Additional logic for the proxy, if needed
        // ...

        // Delegate the method call to the HotelsuchePort
        return hotelRetrieval.getHotelByName(name);
    }

    public void openSession() {
        // Additional logic for the proxy, if needed
        // ...

        // Delegate the method call to HotelRetrieval
        hotelRetrieval.openSession();
    }

}
