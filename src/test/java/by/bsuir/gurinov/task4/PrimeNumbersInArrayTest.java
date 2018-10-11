package by.bsuir.gurinov.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersInArrayTest {

    @Test
    void isPrimeNumbers() {
        PrimeNumbersInArray primeNumbersInArray = new PrimeNumbersInArray();
        assertTrue(primeNumbersInArray.isPrimeNumbers(1));
        assertTrue(primeNumbersInArray.isPrimeNumbers(2));
        assertTrue(primeNumbersInArray.isPrimeNumbers(11));
        assertFalse(primeNumbersInArray.isPrimeNumbers(4));
        assertFalse(primeNumbersInArray.isPrimeNumbers(-10));
        assertFalse(primeNumbersInArray.isPrimeNumbers(0));
    }
}