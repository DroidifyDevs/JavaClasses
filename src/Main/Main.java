package Main;

import DataStructures.Lists.ListItem;
import DataStructures.Lists.OWLL;
import DataStructures.Lists.TWLL;
import Games.Field.Matrix;
import SortsTypes.Sorts.BubbleSort;
import SortsTypes.Sorts.MergeSort;
import SortsTypes.Sorts.QuickSort;
import SortsTypes.Tests.Test;

public class Main {

    public static void TestAllSorts() {
        Test test = new Test();
        QuickSort quickSortSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        test.Start(quickSortSort);
        //TODO: реализовать merge Sort(сортировка слиянием)
        test.Start(mergeSort);
        test.Start(bubbleSort);
    }

    //TODO: сделать удаление из односвязного списка
    public static void main(String[] args) {
        TWLL<Integer> list = new TWLL<>();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        System.out.println(list);
        list.Delete(2);
        System.out.println(list);
        System.out.println(list.Find(3));

        OWLL<Integer> oList = new OWLL<>();
        oList.Add(1);
        oList.Add(2);
        oList.Add(3);
        System.out.println(oList);
        oList.Delete(2);
        System.out.println(oList);
        System.out.println(oList.Find(3));
//        ListItem<Integer> item1;
//        ListItem<String>item2;
//        IOHelper ioHelper = new IOHelper();
//        System.out.println("STACK TEST");
//        Stack<Integer> stack = new Stack<>();
//        Dack dack = new Dack();
//        Queue q = new Queue();
//        //stack test
//        for (int i = 0; i < 10; i++)
//            stack.PushBack(i);
//        System.out.println(stack.toString());
//        for (int i = 0; i < 10; i++)
//            stack.PopBack();
//        System.out.println(stack.toString());
//        System.out.println("__________");
//
//        System.out.println("DACK TEST");
//        for (int i = 0; i < 10; i++)
//            dack.PushFront(i);
//        System.out.println(dack.toString());
//        for (int i = 0; i < 10; i++)
//            dack.PopFront();
//        System.out.println(dack.toString());
//        System.out.println("__________");
//
//        System.out.println("QUEUE TEST");
//        for (int i = 0; i < 10; i++)
//            q.PushBack(i);
//        System.out.println(q.toString());
//        for (int i = 0; i < 10; i++)
//            q.PopFront();
//        System.out.println(q.toString());
//        System.out.println("__________");

        Matrix<Integer> matrix = new Matrix<Integer>(5, 5);
    }

    void AddToList(Integer intToAdd)
    {

    }
}
