package designpatterns.iterator;

import designpatterns.iterator.v0.menu.MenuItem;

import java.util.Iterator;

public interface IteratorCreator {
    Iterator<MenuItem> createIterator();
}
