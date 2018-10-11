package by.bsuir.gurinov.task13;

import by.bsuir.gurinov.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object object) {
        ProgrammerBook programmerBook;

        if (object == this) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }

        programmerBook = (ProgrammerBook) object;
        return super.equals(object) && Objects.equals(programmerBook.language, language)
                && (programmerBook.level == level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return super.toString() + ", language: " + language + ", level: " + level;
    }

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);

        this.language = language;
        this.level = level;
    }
}