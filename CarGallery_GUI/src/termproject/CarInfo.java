package termproject;

public abstract class CarInfo implements IcarInfo {

    private String VIN;
    private String make;
    private String model;
    private int year;
    private int km;
    private int sellerId;
    private Double price;

    public CarInfo(String VIN, String make, String model, int year, int km, int sellerId, Double price) {

        this.VIN = VIN;
        this.make = make;
        this.model = model;
        this.year = year;
        this.km = km;
        this.sellerId = sellerId;
        this.price = price;
    }

    @Override
    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarInfo{ " + "VIN= " + VIN + ", make= " + make + ", model= " + model
                + ", year= " + year + ", km= " + km + ", sellerId= " + sellerId + ", price= " + price + "Tax= " + taxes() + '}';
    }

    public abstract double taxes();
}
