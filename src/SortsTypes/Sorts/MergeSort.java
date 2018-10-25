package SortsTypes.Sorts;

import java.util.ArrayList;

/**
 * Sorting using Merge
 */
public class MergeSort extends  Sort
{
    @Override
    public Integer[] Sort(Integer[] items, Direction direction) {
        return Sort(items,0,items.length-1,direction);
    }

    @Override
    public Integer[] Sort(Integer[] items, int start, int end, Direction direction) {
        return new Integer[0];
    }

    /**
     * сортирует списк
     *
     * @param items     список
     * @param direction напрвление: по возрастанию/убыванию
     * @return
     */
    @Override
    public ArrayList<Integer> Sort(ArrayList<Integer> items, Direction direction) {
        return null;
    }

    /**
     * сортирует списк
     *
     * @param items     список
     * @param start     начальный индекс
     * @param end       конечный индекс
     * @param direction напрвление: по возрастанию/убыванию
     * @return
     */
    @Override
    public ArrayList<Integer> Sort(ArrayList<Integer> items, int start, int end, Direction direction) {
        return null;
    }
}
