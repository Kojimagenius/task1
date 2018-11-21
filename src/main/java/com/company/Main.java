package com.company;
//import java.util.Scanner;
//import com.company.person;
import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {



        comparator cmp = new NameComparator();
       Sorter s = new buble(cmp);
       PersonHolder ph = new PersonHolder(s);
       ph.delete(0);
       System.out.println(ph.GetPersonWithI(1).getAge());



    }
}
