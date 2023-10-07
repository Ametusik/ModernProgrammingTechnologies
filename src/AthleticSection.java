import java.util.ArrayList;
import java.util.Iterator;

public class AthleticSection implements Section {

    ArrayList<Item> items;

    public AthleticSection() {
        items = new ArrayList<Item>();
        addItem(0, "Евгений", "Крутой", false, 3000);
        addItem(1, "Татьяна", "Красивая", true, 5000);
        addItem(2, "Мустафа", "Мусульманин", false, 200);
        addItem(3, "Вадим", "Во френдзоне", false, 5500);
        addItem(4, "Илья", "Работает", false, 1200);
    }

    public void addItem(int id, String name, String description, boolean sex, double price) {
        Item item = new Item(id, name, description, sex, price);
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    public Iterator<Item> createIterator() {
        return items.iterator();
    }
}
