package com.company;

/**
 * Интерфейс для сравнения полей в классе персон
 * Возвращает + , если 2-я персона больше 1-ой и наоборот(по одному из полей)
 * Если одинаковы - 0.
 */
public interface comparator {
    int compare(person s1, person s2);

}
