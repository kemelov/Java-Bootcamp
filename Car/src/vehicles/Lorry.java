package vehicles;

import details.Engine;
import professions.Driver;

public class Lorry extends Car{
    private double bodyLoadCapacity;

    public Lorry(String brand, char type, double weight, Driver driver, Engine engine, double bodyLoadCapacity) {
        super(brand, type, weight, driver, engine);
        this.bodyLoadCapacity = bodyLoadCapacity;
    }
}
