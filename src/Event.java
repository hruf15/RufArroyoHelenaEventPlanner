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

public Event (String title,LocalDate date, Priority priority) {
    this.title = title;
    this.date = date;
    this.priority = priority;
    this.task = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    public LocalDate getDate(){
        return date;
    }

    public Priority getPriority(){
        return priority;
}
    public ArrayList<String> getTask(){
        return task;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate (LocalDate date) {
        this.date = date;
    }
    public void setPriority (Priority priority){
        this.priority = priority;
    }
    public void setTask(ArrayList<String> task){
        this.task = task;
    }
    @Override
    public String toString() {
        return "Event {" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", priority=" + priority +
                ", task=" + task +
                '}';

    }
    }

