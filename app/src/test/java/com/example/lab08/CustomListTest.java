package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList cityList = new CustomList();
        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.addCity(city);

        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testDeleteException() {
        CustomList cityList = new CustomList();
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(new City("Charlottetown", "Prince Edward Island"));
        });

        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.addCity(city);

        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testCountCities() {
        CustomList cityList = new CustomList();

        assertEquals(0, cityList.countCities());

        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.addCity(city);

        assertEquals(1, cityList.countCities());
    }
}
