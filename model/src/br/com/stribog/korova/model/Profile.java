package br.com.stribog.korova.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Aloysio on 21/12/2014.
 */

public class Profile {
    private String name;
    private Currency defaultCurrency;
    private List<Book> books;
    private Book currentBook;

    private Profile() {
        books = new ArrayList<Book>();
        currentBook = null;
    }

    public static Profile create(Currency defaultCurrency, String name, Calendar startDate) {
        Profile p = new Profile();
        p.name = name;
        p.defaultCurrency = defaultCurrency;

        Book b = Book.create(p, startDate);
        p.currentBook = b;
        p.books.add(b);

        return p;
    }

    public void closeCurrentBook(){
        Book newBook = currentBook.close();
        currentBook = newBook;
        books.add(newBook);
        books.add(newBook);
    }

    public Book getCurrentBook() {
        return currentBook;
    }

    public List<Book> getBooks() {
        return books;
    }

}
