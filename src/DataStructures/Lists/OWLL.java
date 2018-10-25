package DataStructures.Lists;

import java.io.Console;

/**
 * Односвязный список
 */
public class OWLL<T> extends LL {
    //TODO:доделать односвязный список
    @Override
    public void Add(Object value) {
        if (head == null && tail == null) {
            head = new ListItem<T>(this.id++, (T) value, null, null);
            tail = head;
        } else {
            ListItem item = new ListItem<T>(this.id++, (T) value, null, null);
            tail.next = item;
            tail = item;
        }
    }

    @Override
    public void Delete(Object value) {
        if (head != null && tail != null) {
            ListItem<T> current = Find((T) value);
            if (current != null) {
                ListItem<T> prev = head;
                while (prev!=null) {
                    if(prev.next!=current)
                        prev = prev.next;
                    else
                        break;
                }
                ListItem<T> next = current.next;
                if (prev != null)
                    prev.next = next;
                if (current == head)
                    head = next;
                if (current == tail)
                    tail = prev;
            }
        }
    }
}
