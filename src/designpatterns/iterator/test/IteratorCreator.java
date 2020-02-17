package designpatterns.iterator.test;

import java.util.Iterator;

public interface IteratorCreator {
    Iterator<MenuItem> createIterator();
}
