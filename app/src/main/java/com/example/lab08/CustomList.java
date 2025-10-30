package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }

    public boolean hasCity(City city) {
        for (City city_in_list : cities) {
            if (city_in_list.equals(city)) {
                return true;
            };
        }
        return false;
    }

    public void delete(City city) {
        if(!this.hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
}
