package by.bsuir.gurinov.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionValuesTest {

    @Test
    void getFunctionTable() {
        assertEquals(FunctionValues.getFunctionTable(),"| 0 | 0.0 |\n| 1 | 1.557407724654902 |\n");
        FunctionValues.setB(10);
        FunctionValues.setH(10);
    }
}