package ru.otus.arch.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.otus.arch.abstractfactory.enums.SortEnum;
import ru.otus.arch.abstractfactory.factories.FactorySorter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestFactory {
    int[] sourceArray, targetArray;
    FactorySorter factorySorter;

    @BeforeEach
    public void getArray() {
        sourceArray = new int[] {3, 4, 5, 2, 0, 7, 3, 6, -1};
        targetArray = new int[] {-1, 0, 2, 3, 3, 4, 5, 6, 7};
    }

    @Test
    public void TestInsertSorter()
    {
        factorySorter = new FactorySorter(SortEnum.INSERT);
        factorySorter.sortArray(sourceArray);

        assertArrayEquals(sourceArray, targetArray);
    }

    @Test
    public void TestSelectSorter()
    {
        factorySorter = new FactorySorter(SortEnum.SELECT);
        factorySorter.sortArray(sourceArray);

        assertArrayEquals(sourceArray, targetArray);
    }

    @Test
    public void TestMergeSorter()
    {
        factorySorter = new FactorySorter(SortEnum.MERGE);
        factorySorter.sortArray(sourceArray);

        assertArrayEquals(sourceArray, targetArray);
    }
}
