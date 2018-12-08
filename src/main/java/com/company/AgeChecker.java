package com.company;

public class AgeChecker implements Checker{
    public boolean check(Person p, Object value) {
        return Integer.valueOf(p.getAge()).equals(value);
    }
}
