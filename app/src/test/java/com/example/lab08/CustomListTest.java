package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    private City edmonton;


    @BeforeEach
    public void createList() {
        list = new CustomList();
        edmonton = new City("Edmonton", "AB");
    }

    @Test
    public void hasCityTest() {
        list.addCity(edmonton);
        assertEquals(list.hasCity(edmonton), true);
    }

}
