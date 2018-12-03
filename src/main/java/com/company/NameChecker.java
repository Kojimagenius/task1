package com.company;

public class NameChecker implements Checker {
    public boolean check(Person p, Object value) {
        return p.getName().equals(value);
    }
}
