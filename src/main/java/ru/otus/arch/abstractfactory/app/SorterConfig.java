package ru.otus.arch.abstractfactory.app;

import ru.otus.arch.abstractfactory.enums.SortEnum;
import ru.otus.arch.abstractfactory.factories.FactorySorter;
import ru.otus.arch.abstractfactory.factories.ISortFactory;

public class SorterConfig {
    public static ISortFactory config(SortEnum sortMethod) {
        return new FactorySorter(sortMethod);
    }
}
