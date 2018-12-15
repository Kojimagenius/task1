package com.company;

import org.joda.time.LocalDate;

import static org.junit.Assert.*;

public class bubleTest {

    @org.junit.Test
    public void sort() {
        Comparator cmp = new NameComparator();
        Sorter test = new Hbrush(cmp);
        Person P1 = new Person("Ax Dun", new LocalDate(1998, 02, 5));
        Person P2 = new Person("Ciri", new LocalDate(1963,11,14));
        Person P3 = new Person("Biri", new LocalDate(1900,11,14));
        Person arr1[] = new Person[3];
        Person arr2[] = new Person[3];
        arr1[0] = P1;
        arr1[1] = P2;
        arr1[2] = P3;
        arr2[0] = P2;
        arr2[1] = P3;
        arr2[2] = P1;
        test.Sort(arr1, new NameComparator());
        assertEquals(arr1,arr2);

    }
}