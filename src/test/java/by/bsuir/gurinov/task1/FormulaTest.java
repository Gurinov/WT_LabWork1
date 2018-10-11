package by.bsuir.gurinov.task1;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class FormulaTest {

    @Test
    void getResult() {
        assertTrue((Formula.getResult(0,0) - 0.5) < 0.001);
    }
}