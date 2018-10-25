package SortsTypes.Sorts;

import java.util.ArrayList;

/**
 *Sorting using Bubble sort
 */
public class BubbleSort extends Sort {
    @Override
    public Integer[] Sort(Integer[] items, Direction direction) {
        for (int i = 0; i < items.length; i++)
            for (int j = 0; j < items.length - i - 1; j++)
                if (Compare(items[j], items[j + 1], direction)) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
        return items;
    }

    @Override
    public Integer[] Sort(Integer[] items, int start, int end, Direction direction) {
        return new Integer[0];
    }

    @Override
    public ArrayList<Integer> Sort(ArrayList<Integer> items, Direction direction) {
        Integer[] copy = new Integer[items.size()];
        copy = items.toArray(copy);
        copy = Sort(copy, direction);
        items.clear();
        for (Integer item : copy)
            items.add(item);
        return items;
    }

    @Override
    public ArrayList<Integer> Sort(ArrayList<Integer> items, int start, int end, Direction direction) {
        return Sort(items, direction);
    }
}
