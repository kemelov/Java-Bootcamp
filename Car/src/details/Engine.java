package details;

public class Engine {
    private double power;
    private String mnfer;

    public Engine() {
    }

    public Engine(double power, String mnfer) {
        this.power = power;
        this.mnfer = mnfer;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getMnfer() {
        return mnfer;
    }

    public void setMnfer(String mnfer) {
        this.mnfer = mnfer;
    }
}
