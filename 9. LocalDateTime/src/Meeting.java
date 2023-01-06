import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Meeting {
    private final LocalDateTime dateTime;
    private final Duration duration;
    private final ArrayList<Employee> participants;
    Status status;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss yyyy.MM.dd");

    Meeting(LocalDateTime dateTime, Duration duration, ArrayList<Employee> participants, Status status) {
        this.dateTime = dateTime;
        this.duration = duration;
        this.participants = participants;
        this.status = status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public long getDuration() {
        return duration.toHours();
    }

    public ArrayList<Employee> getParticipants() {
        return participants;
    }



    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "----Встреча----" +"\n"+
                "Дата и время проведения: " + dateTime.format(formatter) +"\n"+
                "Длительность(час): " + getDuration()+"\n"+
                "Статус: " + getStatus();
    }

    public static String getTimeDiff(ArrayList<Meeting> meetings){
        return  "Разница в минутах "+ChronoUnit.MINUTES.between(meetings.get(0).getDateTime(), meetings.get(1).getDateTime())+"\n"+
                "Разница в часах "+ChronoUnit.HOURS.between(meetings.get(0).getDateTime(), meetings.get(1).getDateTime())+"\n"+
                "Разница в днях "+ChronoUnit.DAYS.between(meetings.get(0).getDateTime(), meetings.get(1).getDateTime())+"\n"+
                "Разница в месяцах "+ChronoUnit.MONTHS.between(meetings.get(0).getDateTime(), meetings.get(1).getDateTime())+"\n"+
                "Разница в годах "+ChronoUnit.YEARS.between(meetings.get(0).getDateTime(), meetings.get(1).getDateTime());
    }

    public void rescheduleMeeting(LocalDateTime newDate){
        if (ChronoUnit.HOURS.between(dateTime, newDate) <= 0){
            System.out.println("Указанная дата устарела!");
        } else {
            System.out.println("Встреча перенесена на "+newDate.format(formatter));
            status = Status.DELAYED;
        }
    }


}

enum Status{
    ONGOING,
    DELAYED,
    UPCOMING,
    DECLINED
}