import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Person student1 = new Student("M. Milkina",34,'Ж',PL.JAVA, Payment.PAYED);
        Person student2 = new Student("P. Burza",34,'М', PL.JAVASCRIPT, Payment.HALFPAYED);
        Person student3 = new Student("V. Tortsov",34,'М', PL.FLUTTER, Payment.FREE);

        Person mentor1 = new Mentor("J. Slama",34,'М', PL.FLUTTER, Degree.SENIOR);
        Person mentor2 = new Mentor("J. Buckley",34,'Ж', PL.JAVA, Degree.MIDDLE);
        Person mentor3 = new Mentor("A. Sapkovskiy",34,'М', PL.PYTHON, Degree.SENIOR);

        Person[] students = new Person[]{student1, student2, student3};
        Person[] mentors = new Person[]{mentor1, mentor2, mentor3};

        PL[] pl = new PL[]{PL.JAVA, PL.PYTHON, PL.JAVASCRIPT, PL.FLUTTER};

        System.out.println("МЫ обучаем ->"+ Arrays.toString(PL.values()));

        System.out.println("График расписаний");
        for (PL i:pl) {
            System.out.printf("Название: %s\nПриоритет: %d\n", i.name(), i.ordinal());
        }


        System.out.println("\n----Студенты----");
        for (Person i: students) {
            System.out.printf("\nИмя: %s\nВозраст: %d\nПол: %s\nЯП: %s\nКонтракт: %s\n", i.getFio(), i.getAge(), i.getGender(), i.getPl(), i.getENUM());
        }

        System.out.println("\n----Менторы----");
        for (Person i: mentors) {
            System.out.printf("\nИмя: %s\nВозраст: %d\nПол: %s\nЯП: %s\nУровень: %s\n", i.getFio(), i.getAge(), i.getGender(), i.getPl(), i.getENUM());
        }
    }
}
