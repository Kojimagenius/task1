package com.company;

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonHolderTest {

    @Test
    public void push() {
        Comparator cmp = new NameComparator();
        Sorter srt = new Buble();
        PersonHolder ph1 = new PersonHolder(srt);
        Person P1 = new Person("Ax Dun", new LocalDate(1998, 02, 5));
        ph1.push(P1);
        assertEquals(ph1.GetPersonWithI(0), P1);


    }
    @Test
    public void delete() {
        NameChecker ch = new NameChecker();
        Comparator cmp = new NameComparator();
        //Sorter srt = new Buble(cmp);
        PersonHolder ph1 = new PersonHolder();
        Person P1 = new Person("Ax Dun", new LocalDate(1998, 02, 5));
        System.out.println(ch.check(P1, "Ax Dun"));
        Person P2 = new Person("Ciri", new LocalDate(1963,11,14));
        Person P3 = new Person("Biri", new LocalDate(1900,11,14));
        ph1.push(P2);
        ph1.push(P3);
        ph1.push(P1);
        ph1.delete(2);
        assertEquals(ph1.GetLength(),2);
    }
}