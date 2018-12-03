package com.company;
import org.joda.time.LocalDate;
import org.joda.time.Years;


public class Person {
    private String name;
    private LocalDate DateOfBirth ;
    /**
     * svoistva dlya pervichnoy proverki
     * @param dateOfBirth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
    public LocalDate getDateOfBirth() { return DateOfBirth;}
/**

 */
    public int getAge() {
        return Years.yearsBetween(DateOfBirth, LocalDate.now()).getYears();
    }

    public String getName() { return name;}

    public void setName(String name) {
        this.name = name;
    }

    /**
    konstruktor
     */
    Person(String Name, LocalDate dateOfBirth )
    {
        name = Name;
        DateOfBirth = dateOfBirth;
    }
    Person()
    { }

}
