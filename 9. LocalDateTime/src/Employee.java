import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Employee {
    private String name;
    private LocalDate birthday;
    private char gender;

    public Employee(String name, LocalDate birthday, char gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }


    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public char getGender() {
        return gender;
    }

    public String getAge(){
        return ""+ ChronoUnit.YEARS.between(getBirthday(), LocalDate.now());
    }
}
