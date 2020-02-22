package designpatterns.iterator.v0;

import designpatterns.iterator.v0.menu.DinerMenu;
import designpatterns.iterator.v0.menu.MenuItem;
import designpatterns.iterator.v0.menu.PancakeHouseMenu;

import java.util.ArrayList;

public class AprilWaitress extends Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    public AprilWaitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
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
        System.out.println("BREAKFAST");
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println("\nLUNCH");
        for (int i = 0; i < dinerMenu.getNumberOfItems(); i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

// other methods here

}
