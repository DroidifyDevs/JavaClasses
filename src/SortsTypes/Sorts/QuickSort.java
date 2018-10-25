package SortsTypes.Sorts;

import java.util.ArrayList;

/**
 * Sorting using Quick Sort
 */
public class QuickSort extends Sort
{
    @Override
    public Integer[] Sort(Integer[] items, Direction direction) {
        return Sort(items,0,items.length-1,direction);
    }

    @Override
    public Integer[] Sort(Integer[] items, int start, int end, Direction direction) {
        if(start < end) {
            int pos = Partition(items, start, end,direction);
            Sort(items, start, pos - 1,direction);
            Sort(items, pos + 1, end,direction);
        }
        return items;
    }

    @Override
    public ArrayList<Integer> Sort(ArrayList<Integer> items, Direction direction) {
        return null;
    }

    @Override
    public ArrayList<Integer> Sort(ArrayList<Integer> items, int start, int end, Direction direction) {
        return null;
    }

    private  int Partition(Integer[] arr, int i, int j,Direction direction) {
        int pivot = arr[j];
        int small = i - 1;
        for(int k = i; k < j; k++) {
            if(!Compare(arr[k],pivot,direction)) {
                small++;
                Swap(arr, k, small);
            }
        }
        Swap(arr, j, small + 1);
        return small + 1;
    }
}







