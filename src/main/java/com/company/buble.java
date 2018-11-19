package com.company;

import org.joda.time.LocalDate;

public class buble implements Sorter
        {
            comparator cmp;


            /**
             * Вспомогательный метод для изменения значений соседних эл-ов
             * @param arr
             * @param first
             * @param second
             */
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

            /**
             * Метод сортировкi
             * Возвращает отсортированный массив
             */
            public void Sort(person arr[])
            {
                for(int j = arr.length - 1; j !=0; j--){
                for(int i = 0; i < j; i ++)
                {
                    if(cmp.compare(arr[i], arr[i+1]) < 0 )
                        swap(arr, i, i+1);
                }
                }


            }
            buble(comparator cmp)
            {
            this.cmp = cmp;

            }
        }
