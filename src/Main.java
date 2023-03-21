import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,CarInformation> map = new HashMap<>();
        map.put(new Car(12431,"01KG|777|www"),
                new CarInformation("Mercedes Benz","W124",
                        LocalDate.of(1995,1,13),"black",5000));
        map.put(new Car(23435,"01KG|570|ADI"),
                new CarInformation("Lexus","Es-350",
                        LocalDate.of(2017,5,30), "White",8000));
        System.out.println(map.entrySet());
    }
}