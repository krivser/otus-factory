package ru.otus.arch.abstractfactory.products;

import java.util.Arrays;

public class MergeSorter implements ISorter {
    private void mergeSort(int[] a, int lo, int hi)
    {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    @Override
    public void sort(int[] array) {
        System.out.println("Сортировка методом слияния");
        System.out.print(Arrays.toString(array) + " => ");
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
