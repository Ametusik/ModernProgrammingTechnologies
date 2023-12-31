import java.util.Iterator;

public class BoxingSectionIterator implements Iterator {
    Item[] list;
    int position = 0;

    public BoxingSectionIterator(Item[] list) {
        this.list = list;
    }

    public Item next() {
        Item item = list[position];
        position = position + 1;
        return item;
    }

    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }

    }

}
