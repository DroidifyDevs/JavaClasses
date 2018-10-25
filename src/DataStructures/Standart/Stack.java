package DataStructures.Standart;

public class Stack<E> extends DataStructure {

    /**
     * добавить в начало
     *
     * @param item элемент
     */
    @Override
    void PushFront(Object item) {
        throw new UnsupportedOperationException();
    }

    /**
     * добавить в конец
     *
     * @param item элемент
     */
    @Override
    public void PushBack(Object item) {
        items.add(item);
    }

    /**
     * извлечь сначала
     *
     * @return элемент
     */
    @Override
    Object PopFront() {
        throw new UnsupportedOperationException();
    }

    /**
     * извлечь с конца
     *
     * @return элемент
     */
    @Override
    public Object PopBack() {
        if (GetSize() == 0)
            throw new NegativeArraySizeException();
        Object item = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return item;
    }
}
