package br.com.stribog.korova.model;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Aloysio on 21/12/2014.
 */
public class Book {
    private Calendar start;
    private Calendar end;
    private Profile parent;
    private List<Group> groups;

    public enum Status {
        OPENED,CLOSED
    }

    private Book() {
        groups = new ArrayList<Group>();
    }

    public static Book create(Profile parent, Calendar start) {
        Book b = new Book();
        b.start = start;
        b.parent = parent;

        return b;
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getEnd() {
        return end;
    }

    public Status getStatus(){
        if ( end == null ){
            return Status.OPENED;
        }
        return Status.CLOSED;
    }

    public Book close() {
        //TODO
        /*
        - Get final incomes and expenses from *all* top groups to calculate a final amount whether it´d be a profit
         or loss;
        - Set current date as close date;
        - Clone the current book structure (accounts and groups) into a *new book*;
        - Set new book´s start date as current date;
        - For each patrimonial account (assets and liabilities) create a new transaction with amount as "last balance"
        and credit/debit as "initial balances";
         */

        return null;
    }



}
