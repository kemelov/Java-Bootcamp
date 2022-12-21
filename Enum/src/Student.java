public class Student extends Person{
    Payment payment;
    public Student(String fio, int age, char gender, PL pl, Payment payment) {
        super(fio, age, gender, pl);
        this.payment = payment;
    }

    public Payment getENUM() {
        return payment;
    }
}

