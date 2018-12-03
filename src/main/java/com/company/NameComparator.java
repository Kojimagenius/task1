package com.company;

public class NameComparator implements Comparator {
    public int compare(Person p1, Person p2)
    {
     return p1.getName().compareTo(p2.getName());
    }
}
