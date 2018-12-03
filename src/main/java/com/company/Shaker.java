package com.company;

public class Shaker implements Sorter {
    Comparator cmp;
    Shaker(Comparator cmp)
    {
        this.cmp = cmp;
    }
    Shaker(){}
    public void Sort(Person[] arr)
    {
       int left = 0;
       int right = arr.length -1;
       int temp = 0;
       while(left< right)
       {
           for(int i = 0; i < right; i++)
           {
               if(cmp.compare(arr[i], arr[i+1]) <0) {
                   swap(arr, i, i + 1);
                   temp = i;
               }
           }
           right = temp;
           if(left >= right) break;
           for(int i =right; i>left; i--)
           {
               if(cmp.compare(arr[i-1], arr[i]) < 0)
               {
                   swap(arr, i-1,i);
                   temp = i;
               }
           }
           left = temp;
       }
    }
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
}
