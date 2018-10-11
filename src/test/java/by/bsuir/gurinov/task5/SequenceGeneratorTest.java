package by.bsuir.gurinov.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceGeneratorTest {

    @Test
    void getNumberOfItemsToDelete() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        assertEquals(sequenceGenerator.getNumberOfItemsToDelete(),1);
        sequenceGenerator.setNumbers(new int[]{1,2,36,32,8,48});
        assertEquals(sequenceGenerator.getNumberOfItemsToDelete(),2);
    }
}