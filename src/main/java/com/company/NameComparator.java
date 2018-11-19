package com.company;

public class NameComparator implements comparator {
    public int compare(person p1, person p2)
    {
     return p1.getName().compareTo(p2.getName());
    }
}
