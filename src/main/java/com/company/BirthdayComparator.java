package com.company;

public class BirthdayComparator implements comparator{
    public int compare(person p1, person p2)
    {

        return p1.getDateOfBirth().compareTo(p2.getDateOfBirth()) ;
    }
}
