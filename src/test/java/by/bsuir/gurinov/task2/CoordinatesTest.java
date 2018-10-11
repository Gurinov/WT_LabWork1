package by.bsuir.gurinov.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void isValidCoordinates() {
        assertTrue(Coordinates.isValidCoordinates(1,1));
        assertFalse(Coordinates.isValidCoordinates(10,10));
        Coordinates.setCellWeight(10);
        assertTrue(Coordinates.isValidCoordinates(10,10));
        Coordinates.setCellWeight(-10);
        assertFalse(Coordinates.isValidCoordinates(10,10));
    }
}