package designpatterns.iterator.test;

import java.util.ArrayList;
import java.util.Iterator;

public class WaitressImpl extends Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    public WaitressImpl(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    @Override
    public void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        System.out.println("MENU");
        System.out.println("----");
        System.out.println();
        System.out.println("BREAKFAST");
        printMenuIterator(pancakeHouseMenu.createIterator());

        System.out.println();
        System.out.println("LUNCH");
        Iterator<MenuItem> iterator = dinerMenu.createIterator();
        printMenuIterator(iterator);

        System.out.println();
        System.out.println("Cafe");

        printMenuIterator(new CafeMenu().createIterator());

    }

    private void printMenuIterator(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            printMenu(iterator.next());
        }
    }

    private void printMenu(MenuItem menuItem) {
        System.out.print(menuItem.getName() + " ");
        System.out.println(menuItem.getPrice() + " ");
        System.out.println(menuItem.getDescription());
    }

}
