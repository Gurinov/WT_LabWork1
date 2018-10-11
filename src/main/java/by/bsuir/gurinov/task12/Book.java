package by.bsuir.gurinov.task12;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {

    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;
    @Override
    public boolean equals(Object object) {
        Book book;

        if (object == this) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }

        book = (Book) object;
        return Objects.equals(book.title, title) && Objects.equals(book.author, author) && (price == book.price)
                && Objects.equals(book.isbn, isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, edition, isbn);
    }

    @Override
    public String toString() {
        return getClass().getName() + "title: " + title + ", author: " + author + ", price: " + price + ", edition: "
                + edition + ", ISBN: " + isbn;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();

        clone.title = title;
        clone.author = author;
        clone.price = price;
        clone.isbn = isbn;
        return clone;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int compareTo(Book book) {
        return isbn.compareTo(book.isbn); //compareResult;
    }

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
//--------------------------------------------------------------------------------------------
    public static Comparator<Book> COMPARE_BY_TITLE = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return one.title.compareTo(other.title);
        }
    };

    public static Comparator<Book> COMPARE_BY_TITLE_AND_AUTHOR = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            int result;
            result = one.title.compareTo(other.title);
            if(result != 0) return result;
            result = one.author.compareTo(other.author);
            return result;
        }
    };

    public static Comparator<Book> COMPARE_BY_AUTHOR_AND_TITLE = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            int result;
            result = one.author.compareTo(other.author);
            if(result != 0) return result;
            result = one.title.compareTo(other.title);
            return result;
        }
    };

    public static Comparator<Book> COMPARE_BY_AUTHOR_AND_TITLE_AND_PRICE = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            int result;
            result = one.author.compareTo(other.author);
            if(result != 0) return result;
            result = one.title.compareTo(other.title);
            if(result != 0) return result;
            result = Integer.compare(one.price, other.price);
            return result;
        }
    };


}
