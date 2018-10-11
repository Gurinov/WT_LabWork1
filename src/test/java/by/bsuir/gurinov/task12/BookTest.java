package by.bsuir.gurinov.task12;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void compareTo() {
        assertEquals(0,new Book("", "", 0, "978-1-11-111111-1").compareTo(new Book("", "", 0, "978-1-11-111111-1")));
        assertTrue(new Book("", "", 0, "978-1-11-111111-1").compareTo(new Book("", "", 0, "979-1-11-111111-1")) < 0);
        assertTrue(new Book("", "", 0, "979-1-11-111111-1").compareTo(new Book("", "", 0, "978-1-11-111111-1")) > 0);
        assertTrue(new Book("", "", 0, "978-1-11-111111-X").compareTo(new Book("", "", 0, "978-1-11-111111-1")) > 0);
        assertTrue(new Book("", "", 0, "978-1-11-110111-1").compareTo(new Book("", "", 0, "978-1-11-111111-1")) < 0);
        assertTrue(new Book("", "", 0, "978-21-11-10131-1").compareTo(new Book("", "", 0, "978-20-41-11941-X")) > 0);
    }

    @Test
    void COMPARE_BY_TITLE() {
        assertTrue(Book.COMPARE_BY_TITLE.compare(new Book("2", "", 0, ""),new Book("1", "", 0, "")) > 0);
        assertTrue(Book.COMPARE_BY_TITLE.compare(new Book("1", "", 0, ""),new Book("1", "", 0, "")) == 0);
        assertTrue(Book.COMPARE_BY_TITLE.compare(new Book("1", "", 0, ""),new Book("2", "", 0, "")) < 0);
    }

    @Test
    void COMPARE_BY_TITLE_AND_AUTHOR() {
        assertTrue(Book.COMPARE_BY_TITLE_AND_AUTHOR.compare(new Book("2", "", 0, ""),new Book("1", "", 0, "")) > 0);
        assertTrue(Book.COMPARE_BY_TITLE_AND_AUTHOR.compare(new Book("1", "", 0, ""),new Book("1", "", 0, "")) == 0);
        assertTrue(Book.COMPARE_BY_TITLE_AND_AUTHOR.compare(new Book("1", "", 0, ""),new Book("2", "", 0, "")) < 0);
        assertTrue(Book.COMPARE_BY_TITLE_AND_AUTHOR.compare(new Book("1", "1", 0, ""),new Book("1", "2", 0, "")) < 0);
        assertTrue(Book.COMPARE_BY_TITLE_AND_AUTHOR.compare(new Book("1", "2", 0, ""),new Book("1", "1", 0, "")) > 0);

    }

    @Test
    void COMPARE_BY_AUTHOR_AND_TITLE() {
        assertTrue(Book.COMPARE_BY_AUTHOR_AND_TITLE.compare(new Book("2", "2", 0, ""),new Book("1", "1", 0, "")) > 0);
        assertTrue(Book.COMPARE_BY_AUTHOR_AND_TITLE.compare(new Book("1", "1", 0, ""),new Book("1", "1", 0, "")) == 0);
        assertTrue(Book.COMPARE_BY_AUTHOR_AND_TITLE.compare(new Book("1", "2", 0, ""),new Book("2", "2", 0, "")) < 0);
        assertTrue(Book.COMPARE_BY_AUTHOR_AND_TITLE.compare(new Book("1", "1", 0, ""),new Book("1", "2", 0, "")) < 0);
        assertTrue(Book.COMPARE_BY_AUTHOR_AND_TITLE.compare(new Book("1", "2", 0, ""),new Book("1", "1", 0, "")) > 0);
    }

    @Test
    void COMPARE_BY_AUTHOR_AND_TITLE_AND_PRICE() {
        assertTrue(Book.COMPARE_BY_AUTHOR_AND_TITLE_AND_PRICE.compare(new Book("1", "1", 1, ""),new Book("1", "1", 2, "")) < 0);
        assertTrue(Book.COMPARE_BY_AUTHOR_AND_TITLE_AND_PRICE.compare(new Book("1", "1", 2, ""),new Book("1", "1", 1, "")) > 0);
    }

}