import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Component> {

    Stack<Iterator<Component>> stack = new
            Stack<Iterator<Component>>();

    public CompositeIterator(Iterator<Component> iterator) {
        stack.push(iterator);
    }

    public Component next() {
        if (hasNext()) {
            Iterator<Component> iterator = stack.peek();
            Component component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<Component> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}