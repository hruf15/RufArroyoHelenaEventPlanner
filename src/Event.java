import java.time.LocalDate;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Event {

    public enum Priority {
        HIGH, MEDIUM, LOW;
    }

    private String title;
    private LocalDate date;
    private Priority priority;
    private ArrayList<String> task;

}