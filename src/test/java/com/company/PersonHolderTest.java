package com.company;

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonHolderTest {

    @Test
    public void push() {
        comparator cmp = new NameComparator();
        Sorter srt = new buble(cmp);
        PersonHolder ph1 = new PersonHolder(srt);
        person P1 = new person("Ax Dun", new LocalDate(1998, 02, 5));
        ph1.push(P1);
        assertEquals(ph1.GetPersonWithI(0), P1);


    }

    @Test
    public void delete() {
        comparator cmp = new NameComparator();
        Sorter srt = new buble(cmp);
        PersonHolder ph1 = new PersonHolder(srt);
        person P1 = new person("Ax Dun", new LocalDate(1998, 02, 5));
        person P2 = new person("Ciri", new LocalDate(1963,11,14));
        person P3 = new person("Biri", new LocalDate(1900,11,14));
        ph1.push(P2);
        ph1.push(P3);
        ph1.push(P1);
        ph1.delete(2);
        assertEquals(ph1.GetLength(),2);
    }
}