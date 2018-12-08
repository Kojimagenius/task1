package com.company;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.apache.log4j.Logger;


public class Person {
    private static Logger log = Logger.getLogger(Person.class.getName());
    private String name;
    private LocalDate DateOfBirth ;
    /**
     * svoistva dlya pervichnoy proverki
     * @param dateOfBirth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        log.debug("Set date of birth");
        DateOfBirth = dateOfBirth;
    }
    public LocalDate getDateOfBirth() {log.debug("Get date of birth"); return DateOfBirth;}
/**

 */
    public int getAge() {
        log.debug("Get Age of Human with the Date Of Birht param");
        return Years.yearsBetween(DateOfBirth, LocalDate.now()).getYears();
    }

    public String getName() {log.debug("Get name of person"); return name;}

    public void setName(String name) {
        this.name = name;
    }

    /**
    konstruktor
     */
    Person(String Name, LocalDate dateOfBirth )
    {
        log.debug("Initializing of person with params:" + Name + dateOfBirth.toString());
        name = Name;
        DateOfBirth = dateOfBirth;
    }
    Person()
    { }

}
