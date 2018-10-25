package DataStructures.Standart;

public class Queue extends DataStructure {

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
    public Object PopFront() {
        if (GetSize() == 0)
            throw new NegativeArraySizeException();
        Object item = items.get(0);
        items.remove(0);
        return item;
    }

    /**
     * извлечь с конца
     *
     * @return элемент
     */
    @Override
    Object PopBack() {
        throw new UnsupportedOperationException();
    }
}
