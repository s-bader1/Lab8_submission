package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
        @Test
        public void hasCityTest() {
            list.addCity(new City("Halifax", "NS"));
            assertEquals(list.hasCity(), true);
        }

    }

}
