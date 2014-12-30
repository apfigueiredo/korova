package br.com.stribog.korova.model;

import java.util.Calendar;

/**
 * Created by Aloysio on 21/12/2014.
 */
public class Book {
    private Calendar start;
    private Calendar end;
    private Profile parent;

    private Book() {

    }

    public static Book create(Profile parent, Calendar start, Calendar end) {
        Book b = new Book();
        b.start = start;
        b.end = end;
        b.parent = parent;

        return b;
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getEnd() {
        return end;
    }

}
