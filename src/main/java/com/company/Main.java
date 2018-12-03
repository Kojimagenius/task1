package com.company;
//import java.util.Scanner;
//import com.company.Person;

public class Main {

    public static void main(String[] args) {



        Comparator cmp = new NameComparator();
       Sorter s = new Buble(cmp);
       PersonHolder ph = new PersonHolder(s);
       ph.delete(0);
       System.out.println(ph.GetPersonWithI(1).getAge());



    }
}
