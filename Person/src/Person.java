public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println(fullName+" движется");
    }

    public void talk(){
        System.out.println(fullName+" говорит");
    }

    public static void main(String[] args) {
        Person Alexey = new Person("Алексей", 34);
        Person person = new Person();
        person.setFullName(Alexey.fullName);
        person.talk();
        person.move();
    }
}
