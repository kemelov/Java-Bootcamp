import details.Engine;
import professions.Driver;
import vehicles.Car;

public class Main {

    public static void main(String[] args) {
        Engine С4 = new Engine(84.6, "Audi");
        Driver Mikhail = new Driver("Чернов Михаил Анатолиевич", 2);
        Car car = new Car("Audi", 'C', 1710, Mikhail, С4);

        System.out.println(car);
    }

}
