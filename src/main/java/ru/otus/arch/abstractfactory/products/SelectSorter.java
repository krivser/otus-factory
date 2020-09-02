package ru.otus.arch.abstractfactory.products;

import java.util.Arrays;

public class SelectSorter implements ISorter {
    private void selectionSorter(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }

    @Override
    public void sort(int[] array) {
        System.out.println("Сортировка методов выбора");
        System.out.print(Arrays.toString(array) + " => ");
        selectionSorter(array);
        System.out.println(Arrays.toString(array));
    }
}
