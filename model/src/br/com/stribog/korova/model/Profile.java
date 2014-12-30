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

    public static Profile create(Currency defaultCurrency, String name) {
        Profile p = new Profile();
        p.name = name;
        p.defaultCurrency = defaultCurrency;

        return p;
    }

    public Book createBook(Calendar start, Calendar end) throws KorovaModelException {
        if (this.currentBook != null) {
            throw new KorovaModelException("There's already an open book for this profile");
        }
        Book b = Book.create(this, start, end);
        this.currentBook = b;
        books.add(b);

        return b;
    }

}
