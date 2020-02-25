package designpatterns.iterator.v0;

public abstract class Waitress {
    /**
     * prints every item on the menu
     */
    public void printMenu(){
        throw new UnsupportedOperationException();
    }

    /**
     * prints just breakfast items
     */
    public void printBreakfastMenu() {
        throw new UnsupportedOperationException();
    }

    /**
     * prints just lunch items
     */
    public void printLunchMenu() {
        throw new UnsupportedOperationException();
    }

    /**
     * prints all vegetarian menu items
     */
    public void printVegetarianMenu() {
        throw new UnsupportedOperationException();
    }

    /**
     * given the name of an item, returns true
     * if the items is vegetarian, otherwise,
     * returns false
     */
    public void isItemVegetarian(String name) {
        throw new UnsupportedOperationException();
    }
}
