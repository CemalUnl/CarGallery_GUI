package termproject;

import java.util.ArrayList;

public class Adminmenu {

    private static ArrayList<CarInfo> cars;

  
    public Adminmenu() {
        cars = new ArrayList<CarInfo>();

    }

    public void addCarAuto(String VIN, String make, String model, int year, int km, int sellerId, Double price) {
        Automobile auto = new Automobile(VIN, make, model, year, km, sellerId, price);
        cars.add(auto);

    }

    public void addCarCommer(String VIN, String make, String model, int year, int km, int sellerId, Double price) {
        Commercialcar cv = new Commercialcar(VIN, make, model, year, km, sellerId, price);
        cars.add(cv);

    }

    public boolean updateCar(String VIN, String make, String model, int year, int km, int sellerId, Double price) {
        for (CarInfo list : cars) {
            if (list.getVIN().equalsIgnoreCase(VIN)) {
                list.setMake(make);
                list.setModel(model);
                list.setYear(year);
                list.setKm(km);
                list.setSellerId(sellerId);
                list.setPrice(price);
                return true;
            }

        }
        return false;
    }

    public int deleteCar(String VIN) {
        int cnt = 0;
        for (int i = 0; i < cars.size(); i++) {

            CarInfo arac = cars.get(i);

            if (arac.getVIN().equalsIgnoreCase(VIN)) {
                cars.remove(i);
                cnt++;
            }
        }
        return cnt;
    }

    public String display() {
        String output = "";

        for (int i = 0; i < cars.size(); i++) {
            output += cars.get(i) + "\n";
        }

        return output;
    }

    public static ArrayList<CarInfo> getcars() {
        return cars;
    }

}
