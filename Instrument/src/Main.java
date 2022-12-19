public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(22.86);
        Trumpet trumpet = new Trumpet(114.3);

        Instrument[] instruments = new Instrument[]{guitar, drum, trumpet};

        for (Instrument i: instruments){
            i.play();
        }
    }
}
