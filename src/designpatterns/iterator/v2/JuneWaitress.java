package designpatterns.iterator.v2;

import designpatterns.iterator.MenuIteratorCreator;
import designpatterns.iterator.v0.menu.MenuItem;
import designpatterns.iterator.v0.Waitress;

import java.util.Iterator;

public class JuneWaitress extends Waitress {
    private MenuIteratorCreator cafeMenu;
    private MenuIteratorCreator pancakeHouseMenu;
    private MenuIteratorCreator dinerMenu;
    public JuneWaitress(MenuIteratorCreator pancakeHouseMenu, MenuIteratorCreator dinerMenu, MenuIteratorCreator cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    public void printMenu() {

        System.out.println("MENU");
        System.out.println("----");
        System.out.println("BREAKFAST");
        printMenu(pancakeHouseMenu.createIterator());

        System.out.println();
        System.out.println("LUNCH");
        printMenu(dinerMenu.createIterator());
        System.out.println();
        System.out.println("DINNER");
        printMenu(cafeMenu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            printMenu(menuItem);
        }
    }

    private void printMenu(MenuItem menuItem) {
        System.out.print(menuItem.getName() + " ");
        System.out.println(menuItem.getPrice() + " ");
        System.out.println(menuItem.getDescription());
    }

// other methods here

}
