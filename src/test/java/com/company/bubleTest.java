package com.company;

import org.joda.time.LocalDate;

import static org.junit.Assert.*;

public class bubleTest {

    @org.junit.Test
    public void sort() {
        comparator cmp = new NameComparator();
        Sorter test = new shaker (cmp);
        person P1 = new person("Ax Dun", new LocalDate(1998, 02, 5));
        person P2 = new person("Ciri", new LocalDate(1963,11,14));
        person P3 = new person("Biri", new LocalDate(1900,11,14));
        person arr1[] = new person[3];
        person arr2[] = new person[3];
        arr1[0] = P1;
        arr1[1] = P2;
        arr1[2] = P3;
        arr2[0] = P2;
        arr2[1] = P3;
        arr2[2] = P1;
        test.Sort(arr1);
        assertEquals(arr1,arr2);

    }
}