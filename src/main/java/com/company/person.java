package com.company;
import org.joda.time.LocalDate;
import org.joda.time.Years;


public class person {
    private
    int id;
    String first_name;
    String last_name;
    LocalDate DateOfBirth  = new LocalDate(1998, 2, 5);
    LocalDate NowDays = new LocalDate();
    /**
     * Вычисляемое поле возраста
     */
    Years age =  Years.yearsBetween(DateOfBirth, NowDays);

    /**
     * svoistva dlya pervichnoy proverki
     * @param dateOfBirth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public Years getAge() {
        return age;
    }
    /**
    konstruktor
     */
   /* public person(int ID, String First_Name, String Last_name, LocalDate dateOfBirth )
    {
        id = ID;
        first_name = First_Name;
        last_name = Last_name;
        DateOfBirth = dateOfBirth;

    }*/
}
