package termproject;

import java.util.ArrayList;

public class Customermenu {

    private ArrayList<CarInfo> cars;
    private ArrayList<CarInfo> favorites;
    private static ArrayList<Customermenu> messages;
    private String message;

    public Customermenu() {
        cars = Adminmenu.getcars();
        favorites = new ArrayList<CarInfo>();
        messages = new ArrayList<Customermenu>();
    }

    public Customermenu(String message) {

        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String searchSome(String search) {
        String output = "";
        for (CarInfo list : cars) {
            if (list.getMake().equalsIgnoreCase(search) || list.getModel().equalsIgnoreCase(search) || list.getVIN().equalsIgnoreCase(search)) {
                output = list.toString();

            } else {
                int a = Integer.parseInt(search);
                if (list.getKm() == a || list.getSellerId() == a || list.getYear() == a || list.getPrice() == a) {
                    output = list.toString();

                }

            }

        }
        return output;
    }

    public boolean addFavorites(String VIN) {

        for (int i = 0; i < cars.size(); i++) {
            CarInfo Carv = cars.get(i);
            if (favorites.contains(Carv)) {
                return false;
            } else {
                if (Carv.getVIN().equalsIgnoreCase(VIN)) {
                    favorites.add(i, Carv);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteFavorites(String VIN) {

        for (int i = 0; i < cars.size(); i++) {
            CarInfo Carv = cars.get(i);
            if (favorites.contains(Carv)) {
                 if (Carv.getVIN().equalsIgnoreCase(VIN)) {
                    favorites.remove(i);
                    return true;
                }
            } else {
               return false;
            }
        }
        return false;
    }
    
    public String listOfFavorites() {
        String outputlist = "";
        for (CarInfo c : favorites) {
            outputlist += "CarInfo{" + "VIN=" + c.getVIN() + ", make=" + c.getMake() + ", model=" + c.getModel()
                    + ", year=" + c.getYear() + ", km=" + c.getKm() + ", sellerId=" + c.getSellerId() + ", price=" + c.getPrice() + "Tax=" + c.taxes() + '}';

        }
        return outputlist;
    }

    public void addmessage(String message) {

        Customermenu mssg = new Customermenu(message);
        messages.add(mssg);

    }

    public String listsOfmessages() {
        String output = "";

        for (Customermenu m : messages) {
            output += "\n" + m.getMessage() + "\n";
        }

        return output;

    }

}
