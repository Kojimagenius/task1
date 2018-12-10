package com.company;

public class Hbrush implements Sorter {
    Hbrush(Comparator cmp)
    {
    }
    Hbrush(){}

    private void swap(Person arr[], int first, int second)
    {
        Person temp;
        if(arr[first] != arr[second])
        {
            temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
    public void Sort(Person[]arr, Comparator cmp)
    {
        int gap = arr.length;
        boolean swaped = true;
        while(gap > 1 || swaped)
        {
            if(gap > 1)
                gap = (int)(gap/1.247);
            int i = 0;
            swaped = false;
            while(i + gap < arr.length)
            {
                if(cmp.compare(arr[i], arr[i + gap]) < 0)
                {
                    swap(arr, i, i+gap);
                    swaped = true;
                }
                i++;
            }
        }
    }
}
