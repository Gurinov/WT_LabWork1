package by.bsuir.gurinov.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareMatrixTest {

    @Test
    void generateSquareMatrix() {
        SquareMatrix squareMatrix = new SquareMatrix();
        squareMatrix.setNumbers(new double[]{1});
        double[][] array = new double[][]{{1}};
        assertEquals(squareMatrix.generateSquareMatrix()[0][0], array[0][0]);
    }
}