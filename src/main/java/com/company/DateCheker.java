package com.company;

public class DateCheker implements Checker {
    public boolean check(Person p, Object value) {
        return p.getDateOfBirth().equals(value);
    }
}
