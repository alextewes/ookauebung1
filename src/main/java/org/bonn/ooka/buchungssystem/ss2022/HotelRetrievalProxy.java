package org.bonn.ooka.buchungssystem.ss2022;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class HotelRetrievalProxy implements HotelSuche {

    private static final Logger logger = LoggerFactory.getLogger(HotelRetrievalProxy.class);

    private final HotelRetrieval hotelRetrieval;

    public HotelRetrievalProxy() {
        this.hotelRetrieval = new HotelRetrieval(new Cache());
    }

    @Override
    public List<Hotel> getHotelsByName(String name) {
        logger.info("{}: Zugriff auf Buchungssystem über Methode getHotelByName. Suchwort: {}", getCurrentDateTime(),
                name);
        return hotelRetrieval.getHotelsByName(name);
    }

    public void openSession() {
        hotelRetrieval.openSession();
    }

    public void closeSession() {
        hotelRetrieval.closeSession();
    }

    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm");
        return now.format(formatter);
    }
}
