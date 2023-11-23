package web.model;

public class Car {

    private String model;

    private int bornYear;

    private int mileage;

    public Car() {
    }

    public Car(String model, int bornYear, int mileage) {
        this.model = model;
        this.bornYear = bornYear;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
