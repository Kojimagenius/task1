package com.company;
public class PersonHolder {
    int counter = 0;
    person mas[];

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

        return Temp;
    }


}
