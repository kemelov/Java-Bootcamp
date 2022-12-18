package vehicles;

import details.Engine;
import professions.Driver;

public class sportCar extends Car{
    private int maxSpeed;

    public sportCar(String brand, char type, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, type, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
