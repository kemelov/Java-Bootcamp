import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PM extends Employee{
    private int teamMembers;

    public PM(String name, LocalDate birthday, char gender, int teamMembers) {
        super(name, birthday, gender);
        this.teamMembers = teamMembers;
    }

    public int getTeamMembers() {
        return teamMembers;
    }


    @Override
    public String getDescription() {
        return "Людей в команде этого продакт-менеджера: "+getTeamMembers();
    }
}
