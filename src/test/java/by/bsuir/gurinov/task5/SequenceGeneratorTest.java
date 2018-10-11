package by.bsuir.gurinov.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceGeneratorTest {

    @Test
    void getNumberOfItemsToDelete() {
        assertEquals(SequenceGenerator.getNumberOfItemsToDelete(),1);
        SequenceGenerator.setNumbers(new int[]{1,2,36,37,32,48});
        assertEquals(SequenceGenerator.getNumberOfItemsToDelete(),1);
        SequenceGenerator.setNumbers(new int[]{1,3,10,15,4,20,5,11,6,48});
        assertEquals(SequenceGenerator.getNumberOfItemsToDelete(),1);
    }
}