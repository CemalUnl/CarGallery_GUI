package termproject;

public class Commercialcar extends CarInfo {

    public Commercialcar(String VIN, String make, String model, int year, int km, int sellerId, Double price) {
        super(VIN, make, model, year, km, sellerId, price);
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }

    @Override
    public void setSellerId(int sellerId) {
        super.setSellerId(sellerId);
    }

    @Override
    public void setKm(int km) {
        super.setKm(km);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setMake(String make) {
        super.setMake(make);
    }

    @Override
    public void setVIN(String VIN) {
        super.setVIN(VIN);
    }

    public double taxes() {
        return getYear() * 0.5;

    }

}
