import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CEO extends Employee{
    private boolean hasCompanyCar;
    CEO(String name, LocalDate birthday, char gender, boolean hasCompanyCar){
        super(name, birthday, gender);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }


    @Override
    public String getDescription() {
        return "Этот CEO имеет служебную машину: "+isHasCompanyCar();
    }
}
