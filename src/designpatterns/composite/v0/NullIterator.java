package designpatterns.composite.v0;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
    public MenuComponent next() {
        return null;
    }
    public boolean hasNext() {
        return false;
    }
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
