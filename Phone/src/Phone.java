public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public void receiveCall(String name, long number){
        System.out.println("\nЗвонит "+name+" "+number);
    }

    public void sendMessage(long[]numbers){
        System.out.println("Номера, которым будет отправлено сообщения: ");
        for (long i : numbers){
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "\nНомер: " + number +
                "\nМодель:" + model + '\'' +
                "\nВес: " + weight;
    }

//    public long getReceivedNum(long receivedNum){
//        return receivedNum;
//    }
}
