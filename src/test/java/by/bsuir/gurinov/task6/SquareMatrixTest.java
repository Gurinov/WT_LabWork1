package by.bsuir.gurinov.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareMatrixTest {

    @Test
    void generateSquareMatrix() {
        SquareMatrix.setNumbers(new double[]{1});
        double[][] array = new double[][]{{1}};
        assertEquals(SquareMatrix.generateSquareMatrix()[0][0], array[0][0]);
    }
}