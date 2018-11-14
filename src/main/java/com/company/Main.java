package com.company;
//import java.util.Scanner;
//import com.company.person;
import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //LocalDate birthday = new LocalDate(1998, 02, 5);
       person P1 = new person("Max Dun", new LocalDate(1998, 02, 5));
        System.out.print(P1.getAge().getYears());
    }
}
