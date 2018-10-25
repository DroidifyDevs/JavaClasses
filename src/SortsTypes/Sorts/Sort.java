package SortsTypes.Sorts;

import java.util.ArrayList;

/**
 * базовый класс сортировки
 */
public abstract class Sort {

    public String name;

    public Sort(){
        name = this.getClass().getName();
    }

    public void Swap(Integer[] arr, int k, int small) {
        int temp = arr[k];
        arr[k] = arr[small];
        arr[small] = temp;
    }

    public boolean Compare(Integer a, Integer b, Direction direction) {
        boolean res = false;
        if (a > b)
            res = true;
        if (direction != Direction.asc)
            return !res;
        return res;
    }

    public abstract Integer[] Sort(Integer items[], Direction direction);

    public abstract Integer[] Sort(Integer items[], int start, int end, Direction direction);

    /**
     * сортирует списк
     *
     * @param items     список
     * @param direction напрвление: по возрастанию/убыванию
     * @return
     */
    public abstract ArrayList<Integer> Sort(ArrayList<Integer> items, Direction direction);

    /**
     * сортирует списк
     *
     * @param items     список
     * @param start     начальный индекс
     * @param end       конечный индекс
     * @param direction напрвление: по возрастанию/убыванию
     * @return
     */
    public abstract ArrayList<Integer> Sort(ArrayList<Integer> items, int start, int end, Direction direction);
}
