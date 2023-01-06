import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Developer extends Employee {
    private String language;

    public Developer(String name, LocalDate birthday, char gender, String language) {
        super(name, birthday, gender);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getDescription() {
        return "Язык программирования этого разработчика: "+getLanguage();
    }
}
