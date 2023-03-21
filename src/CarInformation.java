import java.time.LocalDate;

public class CarInformation {
    private String mark;
    private String model;
    private LocalDate dateOfMade;
    private String color;
    private  long price;

    public CarInformation(String mark, String model, LocalDate dateOfMade, String color, long price) {
        this.mark = mark;
        this.model = model;
        this.dateOfMade = dateOfMade;
        this.color = color;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "CarInformation: " +"\n"+
                "mark: " + mark + "\n"+
                "model: " + model + "\n"+
                "dateOfMade: " + dateOfMade +"\n"+
                "color: " + color + "\n"+
                "price: " + price+" $";
    }
}
