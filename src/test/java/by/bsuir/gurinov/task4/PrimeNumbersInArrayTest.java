package by.bsuir.gurinov.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersInArrayTest {

    @Test
    void isPrimeNumbers() {
        assertTrue(PrimeNumbersInArray.isPrimeNumbers(1));
        assertTrue(PrimeNumbersInArray.isPrimeNumbers(2));
        assertTrue(PrimeNumbersInArray.isPrimeNumbers(11));
        assertFalse(PrimeNumbersInArray.isPrimeNumbers(4));
        assertFalse(PrimeNumbersInArray.isPrimeNumbers(-10));
        assertFalse(PrimeNumbersInArray.isPrimeNumbers(0));
    }
}