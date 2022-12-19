public class Drum implements Instrument {
    private double radius;

    public Drum(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с радиусом "+getRadius()+" сантиметров...");
    }
}
