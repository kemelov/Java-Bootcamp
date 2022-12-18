public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone(892742L, "nokia", 200.0);
        Phone phone2 = new Phone(932352L, "motorola", 300.0);
        Phone phone3 = new Phone(872353L, "samsung", 190.0);


        System.out.println(phone1+"\n"+phone2+"\n"+phone3+"\n");

        long []numbers = new long[]{phone1.getNumber(), phone2.getNumber(), phone3.getNumber()};
        phone1.sendMessage(numbers);

        phone.receiveCall("Артур", 890342L);
    }
}
