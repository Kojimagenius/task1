package com.company;

public class BirthdayComparator implements Comparator {
    public int compare(Person p1, Person p2)
    {

        return p1.getDateOfBirth().compareTo(p2.getDateOfBirth()) ;
    }
}
