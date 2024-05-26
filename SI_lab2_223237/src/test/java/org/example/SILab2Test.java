package org.example;

//import java.util.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyBranchTest() {

        //First Test Case
        RuntimeException exception1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null,100));
        assertTrue(exception1.getMessage().contains("allItems list can't be null!"));

        //Second Test Case
        Item[] list1 = new Item[]{ new Item(null, "1234", 50, 0), new Item("item2", null, 200, 0.10f),
                new Item("item3", "0123", 301, 0.70f)};
        RuntimeException exception2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(list1), 70));
        assertTrue((exception2.getMessage().contains("No barcode!")));

        //Third Test Case
        Item item1 = new Item("item1", "4s21", 200, 0.30f);
        RuntimeException exception3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(item1), 300));
        assertTrue((exception3.getMessage().contains("Invalid character in item barcode!")));

        //Fourth Test Case
        Item item2 = new Item("item1", "1324", 100, 0.10f);
        assertTrue(SILab2.checkCart(List.of(item2), 200));

        //Fifth Test Case
        Item item3 = new Item("item1", "2413", 500, 1.0f);
        assertFalse(SILab2.checkCart(List.of(item3), 120));
    }

    @Test
    void multipleChoiceTest() {
        //Test TTT
        Item item1 = new Item("item1", "1234", 430, 0.3f);
        assertTrue(item1.getPrice()>300);
        assertTrue(item1.getDiscount()>0);
        assertEquals('1', item1.getBarcode().charAt(0));

        //Test TTF
        Item item2 = new Item("item1", "1234", 430, 0.3f);
        assertTrue(item2.getPrice()>300);
        assertTrue(item2.getDiscount()>0);
        assertFalse(item2.getBarcode().charAt(0)=='0');

        //Test TFX
        Item item3 = new Item("item1", "1234", 430, 0.0f);
        assertTrue(item3.getPrice()>300);
        assertFalse(item3.getDiscount()>0);

        //Test FXX
        Item item4 = new Item("item1", "1234", 150, 0.3f);
        assertFalse(item4.getPrice()>300);
    }
}