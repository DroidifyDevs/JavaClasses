package DataStructures.Lists;

/**
 * Элемент списка
 */
public class ListItem<T> {
    /**
     * ИД элемента списка начниается с 1
     * по умолчанию -1
     */
    public Integer id;
    /**
     * значение
     */
    public T value;
    /**
     * предыдущий элемент списка
     */
    public ListItem<T> previous;
    /**
     * следующий элемент списка
     */
    public ListItem<T> next;

    /**
     *
     */
    public ListItem() {
        this.id = -1;
        this.value = null;
        this.previous = null;
        this.next = null;
    }

    /**
     * @param id
     * @param value
     * @param prev
     * @param next
     */
    public ListItem(Integer id, T value, ListItem<T> prev, ListItem<T> next) {
        this.id = id;
        this.value = value;
        this.previous = prev;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("id:%s value:%s", id.toString(), value.toString());
    }
}
