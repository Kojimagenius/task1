package com.company;

import org.apache.log4j.Logger;



public class PersonHolder {
    private static Logger log = Logger.getLogger(PersonHolder.class.getName());
    private int counter;
    private Person mas[];
    /**
     * сортировщик холдера {@link Sorter}
     */
    @AutoInject
    Sorter mySorter;

    /**
     * Метод добавления очередной персоны
     * @param P
     */
    public void push(Person P)
    {
        log.debug("Adding person " + P.getName() + "to repositopry");
        if(counter == 0) {
            mas = new Person[1];
            mas[counter] = P;
            counter ++;
        }
            else
        {
            Person temp[] = new Person[counter + 1];
            System.arraycopy(mas,0,temp,0,counter);
            //for(int i = 0; i< counter;i++) temp[i] = mas[i];
            temp[counter] = P;
            mas = temp;
            counter ++ ;
        }
        mySorter.Sort(mas, new BirthdayComparator());
    }
    public void delete(int Index)
    {
        try {
            log.debug("Deleting person " + mas[Index].getName());

        }catch(NullPointerException e)
        {e.printStackTrace();}
        Person temp[];
        if(counter != 1)
         temp = new Person[counter-1];
        else
            temp = new Person[1];
        for(int i = 0; i < counter-1; i++)
        {
            if(i == Index)
                temp[i] = mas[i + 1];
            else
                temp[i] = mas[i];
        }
        mas = temp;
        counter--;
    }
    public int GetLength()
    {
        return mas.length;
    }
/**
 *Метод, позволяющий получить данные о персоне с индексом
 * @param Index
 */
    public Person GetPersonWithI(int Index)
    {
        return mas[Index];
    }

    /**
     * Метод, убирающий персону из холдера, возвращая ее данные
     * @param Index
     * @return Person with param Index
     */
    public Person pop(int Index)
    {
        Person temp[] = new Person[counter -1];
        Person Temp = mas[Index];
        for(int i =0; i < counter-1 ; i++){
        if(i == Index)
            if(i != counter)
            temp[i] = mas[i + 1];
        else
            temp[i] = mas[i];

        }
        mas = temp;
        counter--;

        return Temp;
    }

    public <T> PersonHolder  search(Checker ch, Object value)
    {
        log.debug("Searching for person with param " + value.toString());
        PersonHolder holder = new PersonHolder();
        for(Person person: mas)
        {
            if(ch.check(person, value)) holder.push(person);
        }
        return holder;
    }


    PersonHolder(Sorter srt)
    {
        mySorter = srt;
        counter = 0;
        mas = null;
    }
    PersonHolder(){
        counter = 0;
        mas = new Person[0];
        Injector.inject(this);
    }

}
