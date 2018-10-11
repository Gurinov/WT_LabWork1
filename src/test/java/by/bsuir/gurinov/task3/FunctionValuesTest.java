package by.bsuir.gurinov.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionValuesTest {

    @Test
    void getFunctionTable() {
        FunctionValues functionValues = new FunctionValues();
        assertEquals(functionValues.getFunctionTable(),"| 0 | 0.0 |\n| 1 | 1.557407724654902 |\n");
        functionValues.setB(10);
        functionValues.setH(10);
    }
}