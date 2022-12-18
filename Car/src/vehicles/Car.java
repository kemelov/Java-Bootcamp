package vehicles;

import details.Engine;
import professions.Driver;

public class Car {
    private String brand;
    private char type;
    private double weight;
    Driver driver;
    Engine engine;

    public Car(String brand, char type, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public void stop(){
        System.out.println("Останавливаемся...");
    }

    public void turnRight(){
        System.out.println("Поворачиваемя налево...");
    }

    public void turnLeft(){
        System.out.println("Поворачиваемя направо...");
    }

    @Override
    public String toString() {
        return "Марка: '" + brand + '\'' +
                "\nКласс: " + type +
                "\nВес: " + weight +
                "\nВодитель: " + driver.getFullName() +
                "\nСтаж (лет): " + driver.getExperience() +
                "\nДвигатель: " + engine.getMnfer()+
                "\nМощность двигателя: " + engine.getPower();
    }
}
