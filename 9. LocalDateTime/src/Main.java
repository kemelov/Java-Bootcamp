import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Employee ceo1 = new CEO("Phil Spencer", LocalDate.of(1968, 1, 12), 'M', true);
        Employee ceo2 = new CEO("Safra Catz", LocalDate.of(1961, 12 ,1), 'F', false);
        Employee dev1 = new Developer("Jake Elliot", LocalDate.of(1978, 3, 21), 'M', "C++");
        Employee dev2 = new Developer("Lucas Pope", LocalDate.of(1977, 10, 3), 'M', "Haxe");
        Employee pm1 = new PM("John Smith", LocalDate.of(1989, 2, 14), 'M', 12);
        Employee pm2 = new PM("Faith Hill", LocalDate.of(1984, 4, 21), 'F', 15);
        Meeting meeting1 = new Meeting(LocalDateTime.of(2023, 1, 9, 8, 0), Duration.ofHours(3), new ArrayList<>(Arrays.asList(ceo1, ceo2, dev1, dev2, pm1, pm2)), Status.UPCOMING);
        Meeting meeting2 = new Meeting(LocalDateTime.of(2023, 1, 19, 8, 30), Duration.ofHours(3), new ArrayList<>(Arrays.asList(ceo1, ceo2, dev1, dev2, pm1, pm2)), Status.UPCOMING);



        System.out.println(meeting1);
        System.out.println("\n----Участники встречи----");
        for (Employee participants:meeting1.getParticipants()) {
            System.out.printf("Имя: %s\nВозраст: %s\nПол: %s\n%s\n\n",participants.getName(), participants.getAge(), participants.getGender(), participants.getDescription());
        }

        meeting1.rescheduleMeeting(meeting2.getDateTime());
        System.out.println(Meeting.getTimeDiff(new ArrayList<>(Arrays.asList(meeting1, meeting2))));
    }
}
