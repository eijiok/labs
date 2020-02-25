package designpatterns.composite;

import designpatterns.composite.v0.MenuComponent;
import designpatterns.composite.v0.MenuItem;
import designpatterns.iterator.v0.Waitress;

import java.util.Iterator;

public class AugustWaiter extends Waitress {
    private final MenuComponent allMenus;

    public AugustWaiter(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
//            try {
                if (menuComponent instanceof MenuItem) {
                    if (menuComponent.isVegetarian()) {
                        menuComponent.print();
                    }
                }
//            } catch (UnsupportedOperationException e) {
////                System.out.println("!");
//            }
        }
    }

}
