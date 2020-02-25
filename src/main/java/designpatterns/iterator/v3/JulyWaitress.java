package designpatterns.iterator.v3;

import designpatterns.iterator.MenuIteratorCreator;
import designpatterns.iterator.v0.menu.MenuItem;
import designpatterns.iterator.v0.Waitress;

import java.util.Iterator;
import java.util.List;

public class JulyWaitress extends Waitress {
    private final List<MenuIteratorCreator> menus;

    public JulyWaitress(List<MenuIteratorCreator> menus) {
        this.menus = menus;
    }
    public void printMenu() {
        System.out.println("MENU");
        System.out.println("----");
        for (MenuIteratorCreator menu : menus) {
            System.out.println();
            System.out.println(menu.getName() + ", " + menu.getDescription());
            System.out.println("---------------------");
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            printMenu(menuItem);
        }
    }

    private void printMenu(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.println(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }

}
