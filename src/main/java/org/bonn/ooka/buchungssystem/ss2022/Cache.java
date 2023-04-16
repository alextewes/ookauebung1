package org.bonn.ooka.buchungssystem.ss2022;

import java.util.HashMap;
import java.util.List;

public class Cache implements Caching{

    private final HashMap<String, List<Hotel>> cache;

    public Cache () {
        this.cache = new HashMap<>();
    }
    @Override
    public void cacheResult(String key, List<Hotel> value) {
        this.cache.put(key, value);
    }

    @Override
    public List<Hotel> getCachedResults(String key) {
        return this.cache.get(key);
    }
}
