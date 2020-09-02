package ru.otus.arch.abstractfactory.products;

import java.util.Arrays;

public class InsertSorter implements ISorter {
    private void insertSorter(int[] array) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }

    @Override
    public void sort(int[] array) {
        System.out.println("Сортировка методом вставки");
        System.out.print(Arrays.toString(array) + " => ");
        insertSorter(array);
        System.out.println(Arrays.toString(array));
    }
}
