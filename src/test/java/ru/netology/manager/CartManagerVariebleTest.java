package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CartManagerVariebleTest {
    CartManager manager = new CartManager(10);
    private PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
    private PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
    private PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);
    private PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", 1, 1);
    private PurchaseItem fifth = new PurchaseItem(5, 5, "fifth", 1, 1);
    private PurchaseItem sixth = new PurchaseItem(6, 6, "sixth", 1, 1);
    private PurchaseItem seventh = new PurchaseItem(7, 7, "seventh", 1, 1);
    private PurchaseItem eighth = new PurchaseItem(8, 8, "eighth", 1, 1);
    private PurchaseItem ninth = new PurchaseItem(9, 9, "ninth", 1, 1);
    private PurchaseItem tenth = new PurchaseItem(10, 10, "tenth", 1, 1);
    private PurchaseItem eleventh = new PurchaseItem(11, 11, "eleventh", 1, 1);

    @Test
    void getLastByNumber() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        PurchaseItem[] actual = manager.getLast();
        PurchaseItem[] expected = new PurchaseItem[] {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
