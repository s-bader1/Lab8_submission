package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    private City edmonton;
    private City halifax;


    @BeforeEach
    public void createList() {
        list = new CustomList();
        edmonton = new City("Edmonton", "AB");
        halifax = new City("Halifax", "NS");
    }

    @Test
    public void hasCityTest() {
        list.addCity(edmonton);
        assertEquals(list.hasCity(edmonton), true);
    }

    @Test
    public void deleteCityTest(){
        list.addCity(edmonton);
        list.deleteCity(edmonton);
        assertEquals(list.hasCity(edmonton), false);
    }

    @Test
    public void countCityTest(){
        list.addCity(edmonton);
        list.addCity(halifax);
        assertEquals(list.countCities(), 2);
    }

}
