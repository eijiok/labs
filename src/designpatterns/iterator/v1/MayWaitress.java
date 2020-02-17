package designpatterns.iterator.v1;

import designpatterns.iterator.v0.menu.DinerMenu;
import designpatterns.iterator.v0.menu.MenuItem;
import designpatterns.iterator.v0.menu.PancakeHouseMenu;
import designpatterns.iterator.v0.Waitress;

import java.util.Iterator;

public class MayWaitress extends Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    public MayWaitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

//    public void printMenu() {
//        Iterator breakfastIterator = pancakeHouseMenu.createIterator();
//        System.out.println("MENU");
//        System.out.println("----");
//        System.out.println("BREAKFAST");
//        printMenu(breakfastIterator);
//
//        System.out.println();
//        Iterator lunchItemsIterator = dinerMenu.createIterator();
//        System.out.println("LUNCH");
//        printMenu(lunchItemsIterator);
//    }

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
