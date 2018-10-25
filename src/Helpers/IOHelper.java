package Helpers;

import java.util.ArrayList;

/**
 * получает и выводин информацию в консоль
 */
public class IOHelper<E> {

    public String ToString(E[] items) {
        String str = "";
        for (int i = 0; i < items.length; i++)
            str += items[i] + " ";
        return str;
    }

    public String ToString(ArrayList<E> items) {
        String str = "";
        for (int i = 0; i < items.size(); i++)
            str += items.get(i) + " ";
        return str;
    }

    public void Print(E[] items) {
        System.out.println(ToString(items));
    }

    public void Print(ArrayList<E> items) {
        System.out.println(ToString(items));
    }
}
