package fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
  public static <T> void collectVehicles(List<? super Vehicle> lv) {
    lv.add(new Car());
    lv.add(new Truck());
  }
//  public static <T extends Vehicle> void showFleet(List<T> lv) {
  // T t = lv.get();
  public static void showFleet(List<? extends Vehicle> lv) {
    for (Vehicle v : lv) {
      System.out.println("> " + v);
//      v.doVehicleSpecificStuff();
    }
//    lv.add(new Truck());
    System.out.println("-----------------");
  }
  public static void main(String[] args) {
    List<Vehicle> ls = new ArrayList<>();
    ls.add(new Car());
    ls.add(new Truck());
    showFleet(ls);

    List<Car> lc = new ArrayList<>();
    lc.add(new Car());
    lc.add(new Car());
    showFleet(lc);

    // List<Car> is NOT assignment compatible to List<Vehicle> ????
//    ls = lc;

    List<Object> companyAssets = new ArrayList<>();
    collectVehicles(companyAssets);
    List<Vehicle> fleet = new ArrayList<>();
    collectVehicles(fleet);
    // not allowed
//    List<Car> cars = new ArrayList<>();
//    collectVehicles(cars);
  }
}
