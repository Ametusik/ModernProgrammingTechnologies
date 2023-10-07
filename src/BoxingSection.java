import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Iterator;

public class BoxingSection implements Section {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Item[] items;

    public BoxingSection() {
        items = new Item[MAX_ITEMS];
        addItem(0, "Евгений", "Крутой", false, 3000);
        addItem(1, "Татьяна", "Красивая", true, 5000);
        addItem(2, "Мустафа", "Мусульманин", false, 200);
        addItem(3, "Вадим", "Во френдзоне", false, 5500);
        addItem(4, "Илья", "Работает", false, 1200);
    }

    public void addItem(int id, String name, String description, boolean sex, double price) {
        Item item = new Item(id, name, description, sex, price);
        if (numberOfItems > MAX_ITEMS) {
            System.err.println("На секции нет свободных мест");
        } else {
            items[numberOfItems] = item;
            numberOfItems += 1;
        }
    }

    public Item[] getItems() {
        return items;
    }


    public Iterator<Item> createIterator() {
        return new BoxingSectionIterator(items);
    }
}
