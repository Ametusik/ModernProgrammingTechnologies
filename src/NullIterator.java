import java.util.Iterator;

public class NullIterator implements Iterator<Component> {

    @Override
    public boolean hasNext() {
        return false;
    }

    public Component next(){
        return null;
    }

}
