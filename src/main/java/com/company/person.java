package com.company;
import org.joda.time.LocalDate;
import org.joda.time.Years;


public class person {
    private String name;
    private LocalDate DateOfBirth ;
    /**
     * Вычисляемое поле возраста
     */
    private int age;

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
        return age;
    }

    public String getName() { return name;}

    public void setName(String name) {
        this.name = name;
    }

    /**
    konstruktor
     */
    person( String Name, LocalDate dateOfBirth )
    {
        name = Name;
        DateOfBirth = dateOfBirth;
        age =  Years.yearsBetween(DateOfBirth, LocalDate.now()).getYears();




    }
    person()
    { }

}
