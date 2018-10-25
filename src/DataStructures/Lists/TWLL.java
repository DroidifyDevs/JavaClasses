package DataStructures.Lists;

/**
 * Двусвязный список
 */
public class TWLL<T> extends LL {

    @Override
    public void Add(Object value)
    {
        if (head == null && tail == null) {
            head = new ListItem<T>(this.id++, (T) value, null, null);
            tail = head;
        } else {
            ListItem item = new ListItem<T>(this.id++, (T) value, null, null);
            tail.next = item;
            item.previous = tail;
            tail = item;
        }
    }

    @Override
    public void Delete(Object value)
    {
        if (head != null && tail != null) {
            ListItem<T> current = Find((T) value);
            if (current != null) {
                ListItem<T> prev = current.previous;
                ListItem<T> next = current.next;
                if (prev != null)
                    prev.next = next;
                if (next != null)
                    next.previous = prev;
                if (current == head)
                    head = next;
                if (current == tail)
                    tail = prev;
            }
        }
    }

}
