package DataStructures.Lists;

public abstract class LL<T> {
    /**
     * счетчик для id;
     * увеличивается на единицу при добавлении
     */
    public Integer id;
    public ListItem<T> head;
    public ListItem<T> tail;

    public LL() {
        this.id = 1;
        this.head = null;
        this.tail = null;
    }

    public LL(ListItem<T> head, ListItem<T> tail) {
        this.id = 1;
        this.head = head;
        this.tail = tail;
    }

    public abstract void Add(T value);

    public abstract void Delete(T value);

    public  ListItem<T> Find(T value){
        if (head != null && tail != null) {
            ListItem<T> current = head;
            while (current != null) {
                if (current.value == value)
                    break;
                current = current.next;
            }
            return current;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "";
        if (head != null && tail != null) {
            ListItem<T> current = head;
            while (current != null) {
                str += current.value + "->";
                current = current.next;
            }
        }
        return str;
    }
}
