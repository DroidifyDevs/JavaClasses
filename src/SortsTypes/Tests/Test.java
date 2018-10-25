package SortsTypes.Tests;

import SortsTypes.Sorts.Direction;
import SortsTypes.Sorts.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Test {

    int count = 5;

    private Integer[] Generate(int count, Direction direction) {
        Random random = new Random();
        Integer items[] = new Integer[count];
        if (direction == Direction.asc) {
            for (int i = 0; i < count; i++)
                items[i] = i;
        }
        if (direction == Direction.desc) {
            for (int i = count; i > 0; i--)
                items[count - i] = i;
        }
        if (direction == Direction.random) {
            for (int i = 0; i < count; i++)
                items[i] = random.nextInt(200) - 100;
        }
        return items;
    }


    private boolean Compare(Integer[] a, Integer[] b) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public boolean Ascending(Sort sort) {
        Integer[] items = Generate(count, Direction.asc);
        sort.Sort(items, Direction.asc);
        if (!Compare(Generate(count, Direction.asc), items))
            return false;
        return true;
    }

    public boolean Descending(Sort sort) {
        Integer[] items = Generate(count, Direction.desc);
        sort.Sort(items, Direction.desc);
        if (!Compare(Generate(count, Direction.desc), items))
            return false;
        return true;
    }

    public boolean Random(Sort sort) {
        Integer[] items = Generate(count, Direction.random);
        Integer[] copy = items.clone();
        sort.Sort(items, Direction.asc);
        Collections.sort(Arrays.asList(copy));
        if (!Compare(copy, items))
            return false;
        return true;
    }

    public void Start(Sort sort) {
        System.out.println("Testing:" + sort.name);
        if (Ascending(sort))
            System.out.println("Asc passed!");
        else
            System.out.println("Asc failed!");
        if (Descending(sort))
            System.out.println("Desc passed!");
        else
            System.out.println("Desc failed!");
        if (Random(sort))
            System.out.println("Random passed!");
        else
            System.out.println("Random failed!");

    }
}
