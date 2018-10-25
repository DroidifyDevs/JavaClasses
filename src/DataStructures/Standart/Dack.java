package DataStructures.Standart;

public class Dack extends DataStructure {

    /**
     * добавить в начало
     *
     * @param item элемент
     */
    @Override
    public void PushFront(Object item) {
        items.add(0, item);
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
        if(GetSize()==0)
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
    public Object PopBack ()
    {
        if(GetSize()==0)
            throw new NegativeArraySizeException();
        Object item = items.get(items.size()-1);
        items.remove(items.size()-1);
        return item;
    }
}
