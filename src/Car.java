public class Car {
    private long id;
    private String carNumber;

    public Car(long id, String carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id: " + id +"\n"+
                "carNumber: " + carNumber;
    }
}
