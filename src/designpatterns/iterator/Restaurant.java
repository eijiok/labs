package designpatterns.iterator;

import designpatterns.iterator.v0.AprilWaitress;
import designpatterns.iterator.v0.Waitress;
import designpatterns.iterator.v0.menu.DinerMenu;
import designpatterns.iterator.v0.menu.PancakeHouseMenu;

public class Restaurant {

    public static void main(String[] args) {
        Waitress april = new AprilWaitress(new PancakeHouseMenu(), new DinerMenu());
//        april.printMenu();
//        Waitress may = new MayWaitress(new PancakeHouseMenu(), new DinerMenu());
//        may.printMenu();

//        Waitress june = new JuneWaitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
////        june.printMenu();
//
//        Waitress july = new JulyWaitress(Arrays.asList(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu()));
//        july.printMenu();
    }
}
