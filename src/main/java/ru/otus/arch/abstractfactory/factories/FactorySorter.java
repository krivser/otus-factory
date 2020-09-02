package ru.otus.arch.abstractfactory.factories;

import ru.otus.arch.abstractfactory.enums.SortEnum;
import ru.otus.arch.abstractfactory.products.ISorter;
import ru.otus.arch.abstractfactory.products.InsertSorter;
import ru.otus.arch.abstractfactory.products.MergeSorter;
import ru.otus.arch.abstractfactory.products.SelectSorter;

public class FactorySorter implements ISortFactory {
    ISorter sorter = null;

    public FactorySorter(SortEnum method) {
        switch (method.name().toUpperCase()) {
            case "SELECT":
                sorter = new SelectSorter();
                break;
            case "INSERT":
                sorter = new InsertSorter();
                break;
            case "MERGE":
                sorter = new MergeSorter();
                break;
        }
    }

    public void sortArray(int[] array) {
        sorter.sort(array);
    }
}
