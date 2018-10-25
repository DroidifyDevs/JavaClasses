package DataStructures.Standart;

import Helpers.IOHelper;

import java.util.ArrayList;

public abstract class DataStructure<E> {
    IOHelper ioHelper = new IOHelper();
    /**
     * элементы
     */
    public ArrayList<E> items = new ArrayList<>();

    /**
     * добавить в начало
     *
     * @param item элемент
     */
    abstract void PushFront(E item);

    /**
     * добавить в конец
     *
     * @param item элемент
     */
    abstract void PushBack(E item);

    /**
     * извлечь сначала
     *
     * @return элемент
     */
    abstract E PopFront();

    /**
     * извлечь с конца
     *
     * @return элемент
     */
    abstract E PopBack();

    /**
     * получить количество элементов
     *
     * @return количество элементов
     */
    int GetSize() {
        return items.size();
    }

    @Override
    public String toString() {
        return ioHelper.ToString(items);
    }
}
