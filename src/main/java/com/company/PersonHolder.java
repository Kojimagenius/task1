package com.company;

import org.joda.time.LocalDate;

public class PersonHolder {
    private int counter;
    private Person mas[];
    /**
     * сортировщик холдера
     */
    Sorter mySorter;

    /**
     * Метод добавления очередной персоны
     * @param P
     */
    public void push(Person P)
    {
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
        mySorter.Sort(mas);
    }
    public void delete(int Index)
    {
        Person temp[] = new Person[counter-1];
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
     * @return
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

    Person[] search(String str)
    {
        Person temp [] = new Person[counter/2] ;
        Person ref = new Person(str, new LocalDate());
        NameComparator cmp= new NameComparator();
        int j = 0;
        for(int i = 0; i < counter; i++)
        {
        if(cmp.compare(ref, mas[i]) == 0){
            if(counter/2 > j)
                temp[j++] = mas[i];
        else
            {
                Person temp1[] = new Person[temp.length + 1];
                temp = temp1;
                temp[j++] = mas[i];
            }
        }
        }
        return temp;
    }
    Person[] search(LocalDate Birthday)
    {
        Person temp[] = new Person[counter/2];

        for(int i = 0; i < counter; i++)
            if (mas[i].getDateOfBirth().compareTo(Birthday) == 0) return temp;
        return null;
    }

    PersonHolder(Sorter srt)
    {
        mySorter = srt;
        counter = 0;
        mas = null;
    }


}
