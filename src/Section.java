import java.util.ArrayList;
import java.util.Iterator;

public class Section extends Component {
    ArrayList<Component> components = new ArrayList<Component>();
    String name;
    String description;

    public Section(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public Component getChild(int i) {
        return (Component) components.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()) {
            Component component = (Component) iterator.next();
            component.print();
        }
    }



}


