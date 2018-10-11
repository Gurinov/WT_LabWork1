package by.bsuir.gurinov.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void isValidCoordinates() {
        Coordinates coordinates = new Coordinates();
        assertTrue(coordinates.isValidCoordinates(1,1));
        assertFalse(coordinates.isValidCoordinates(10,10));
        coordinates.setCellWeight(10);
        assertTrue(coordinates.isValidCoordinates(10,10));
        coordinates.setCellWeight(-10);
        assertFalse(coordinates.isValidCoordinates(10,10));
    }
}