package designpatterns.iterator.test;

public class Restaurant {

    public static void main(String[] args) {
        Waitress waitress = new WaitressImpl(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
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
