public abstract class Person {
    private String fio;
    private int age;
    private char gender;
    PL pl;


    public Person(String fio, int age, char gender, PL pl) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.pl = pl;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public PL getPl() {
        return pl;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", pl=" + pl +
                '}';
    }

    public abstract Object getENUM();
}



enum PL{
    JAVA,
    PYTHON,
    JAVASCRIPT,
    FLUTTER;
}
