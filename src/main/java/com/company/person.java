package com.company;
import org.joda.time.LocalDate;
import org.joda.time.Years;


public class person {
    private
    int id;
    String first_name;
    String last_name;
    LocalDate DateOfBirth = new LocalDate(1998, 2,5);
    LocalDate NowDays = new LocalDate();
    /**
     * Вычисляемое поле возраста
     */
    Years age =  Years.yearsBetween(DateOfBirth, NowDays);
    //public
    
}
