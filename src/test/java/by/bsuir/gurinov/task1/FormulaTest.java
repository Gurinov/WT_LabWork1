package by.bsuir.gurinov.task1;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class FormulaTest {

    @Test
    void getResult() {
        Formula formula = new Formula(0,0);
        assertTrue((formula.getResult() - 0.5) < 0.001);
    }
}