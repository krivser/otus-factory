package ru.otus.arch.abstractfactory.demo;

import ru.otus.arch.abstractfactory.app.SorterConfig;
import ru.otus.arch.abstractfactory.enums.SortEnum;
import ru.otus.arch.abstractfactory.factories.ISortFactory;

public class Demo {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 3, 1, 5};

        for (SortEnum sortMethod : SortEnum.values()) {
            ISortFactory sorter = SorterConfig.config(sortMethod);
            sorter.sortArray(array.clone());
        }
    }
}
