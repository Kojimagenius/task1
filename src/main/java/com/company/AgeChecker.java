package com.company;

public class AgeChecker implements Checker{
    public boolean check(Person p, Object value) {
        return p.getAge() == value;
    }
}
