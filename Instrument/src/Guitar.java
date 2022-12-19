public class Guitar implements Instrument {
    private int stringAmount;

    public Guitar(int stringAmount) {
        this.stringAmount = stringAmount;
    }

    public int getStringAmount() {
        return stringAmount;
    }

    public void setStringAmount(int stringAmount) {
        this.stringAmount = stringAmount;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с "+getStringAmount()+" струнами");
    }
}
