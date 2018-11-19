package com.company;
//import java.util.Scanner;
//import com.company.person;
import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate birthday = new LocalDate(1998, 02, 5);
       person P1 = new person("Ax Dun", new LocalDate(1998, 02, 5));
       person P2 = new person("Ciri", new LocalDate(1963,11,14));
        person P3 = new person("Biri", new LocalDate(1900,11,14));



        comparator cmp = new NameComparator();
       Sorter s = new buble(cmp);
       //buble b = new buble();
        // b.check();
       PersonHolder ph = new PersonHolder(s);
       ph.push(P2);
       ph.push(P3);
       ph.push(P1);
       for(int i = 0; i < 2; i++)
       System.out.println(ph.GetPersonWithI(i).getAge().getYears());



    }
}
