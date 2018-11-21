package com.company;

import org.joda.time.LocalDate;

public class PersonHolder {
    private int counter;
    private person mas[];
    /**
     * сортировщик холдера
     */
    Sorter mySorter;

    /**
     * Метод добавления очередной персоны
     * @param P
     */
    public void push(person P)
    {
        if(counter == 0) {
            mas = new person[1];
            mas[counter] = P;
            counter ++;
        }
            else
        {
            person temp[] = new person[counter + 1];
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
        person temp[] = new person[counter-1];
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
    public person GetPersonWithI(int Index)
    {
        return mas[Index];
    }

    /**
     * Метод, убирающий персону из холдера, возвращая ее данные
     * @param Index
     * @return
     */
    public person pop(int Index)
    {
        person temp[] = new person[counter -1];
        person Temp = mas[Index];
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

    person search(String str)
    {
        person temp;
        for(int i = 0; i < counter; i++)
        {
        if(mas[i].getName() == str)
            return mas[i];
        }
        return null;
    }
    person search(LocalDate Birthday)
    {
        for(int i = 0; i < counter; i++)
            if (mas[i].getDateOfBirth().compareTo(Birthday) == 0) return mas[i];
        return null;
    }

    PersonHolder(Sorter srt)
    {
        mySorter = srt;
        counter = 0;
        mas = null;
    }


}
