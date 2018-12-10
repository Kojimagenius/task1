package com.company;

public class Buble implements Sorter
        {


            /**
             * Вспомогательный метод для изменения значений соседних эл-ов
             * @param arr
             * @param first
             * @param second
             */
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

            /**
             * Метод сортировкi
             * Возвращает отсортированный массив
             */
            public void Sort(Person arr[], Comparator cmp)
            {
                for(int j = arr.length - 1; j !=0; j--){
                for(int i = 0; i < j; i ++)
                {
                    if(cmp.compare(arr[i], arr[i+1]) < 0 )
                        swap(arr, i, i+1);
                }
                }


            }
            Buble(Comparator cmp)
            {
            }
        }
