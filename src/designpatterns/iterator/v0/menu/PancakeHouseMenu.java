package designpatterns.iterator.v0.menu;

import java.util.ArrayList;

public class PancakeHouseMenu {//implements MenuIteratorCreator {
    ArrayList<MenuItem> menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

//    @Override
//    public String getName() {
//        return "PANCAKE HOUSE MENU";
//    }
//
//    @Override
//    public String getDescription() {
//        return "Breakfast";
//    }
//
//    public Iterator<MenuItem> createIterator() {
//        return menuItems.iterator();
//    }

}
