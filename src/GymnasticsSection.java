import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GymnasticsSection implements Section {
    HashMap<String, Item> items = new HashMap<String, Item>();

    public GymnasticsSection() {
        addItem(0, "Евгений", "Крутой", false, 3000);
        addItem(1, "Татьяна", "Красивая", true, 5000);
        addItem(2, "Мустафа", "Мусульманин", false, 200);
        addItem(3, "Вадим", "Во френдзоне", false, 5500);
        addItem(4, "Илья", "Работает", false, 1200);
    }

    public void addItem(int id, String name, String description, boolean sex, double price) {
        Item item = new Item(id, name, description, sex, price);
        items.put(name, item);
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public Iterator<Item> createIterator() {
        return items.values().iterator();
    }
}
