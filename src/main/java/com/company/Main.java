package com.company;
//import java.util.Scanner;
//import com.company.person;
import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //LocalDate birthday = new LocalDate(1998, 02, 5);
       person P1 = new person("Max Dun", new LocalDate(1998, 02, 5));
       person P2 = new person("Ciri", new LocalDate(1963,11,14));
       PersonHolder ph = new PersonHolder();
       ph.push(P1);
       ph.push(P2);
       /*int arr[ ] = new int[2];
       arr[0] = 1;
       arr[1]= 2;
       arr[2] = 3;
       System.out.print();*/
       System.out.print(ph.pop(1).getAge().getYears());
    }
}
