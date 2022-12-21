public class Mentor extends Person{
    Degree degree;
    public Mentor(String fio, int age, char gender, PL pl, Degree degree) {
        super(fio, age, gender, pl);
        this.degree = degree;
    }

    public Degree getENUM() {
        return degree;
    }

}

