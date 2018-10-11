package by.bsuir.gurinov.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void sort() {
        assertEquals(ShellSort.sort(new double[]{3,1})[0],1);
        assertEquals(ShellSort.sort(new double[]{2,1})[1],2);
    }
}