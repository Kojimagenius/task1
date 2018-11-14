package com.company;
public class PersonHolder {
    int counter = 0;
    person mas[];

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
            temp = mas.clone();
            temp[counter + 1] = P;
            mas = temp.clone();
            counter ++ ;
        }
    }

    public person GetPersonWithI(int Index)
    {
        return mas[Index];
    }
    public person pop(int Index)
    {
        person temp[] = new person[counter -1];
        person Temp = new person();
        for(int i = 0; i< counter ; i++)
        {
            if( i==Index )
            {
                Temp = mas[i];
                temp[i] = mas[i+1];
            }
            else
                temp[i] = mas[i];

        }

        return Temp;
    }


}
