package com.company;

public class hbrush implements Sorter {
    comparator cmp;
    hbrush(comparator cmp)
    {
        this.cmp = cmp;
    }
    hbrush(){}

    private void swap(person arr[], int first, int second)
    {
        person temp;
        if(arr[first] != arr[second])
        {
            temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
    public void Sort(person[]arr)
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
