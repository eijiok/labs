package designpatterns.composite;

import designpatterns.composite.v0.Menu;
import designpatterns.composite.v0.MenuComponent;
import designpatterns.composite.v0.MenuItem;
import designpatterns.iterator.v0.Waitress;

public class Restaurant {

    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        allMenus.add(pancakeHouseMenu);
        pancakeHouseMenu.add(new MenuItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        allMenus.add(dinerMenu);
        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));

        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
        dessertMenu.add(new MenuItem("Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99));
        dessertMenu.add(new MenuItem("Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        allMenus.add(cafeMenu);
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69));
        cafeMenu.add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29));

        Waitress august = new AugustWaiter(allMenus);
//        august.printMenu();
        august.printVegetarianMenu();
    }
}
