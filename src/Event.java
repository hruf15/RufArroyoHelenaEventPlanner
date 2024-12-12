import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.PriorityQueue;

public class Event {

    public enum Priority {
        HIGH, MEDIUM, LOW;
    }

    private String title;
    private LocalDate date;
    private Priority priority;
    private ArrayList<EventTask> task;

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
    public ArrayList<EventTask> getTask(){
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
    public void setTask(ArrayList<EventTask> task){
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

    private static void listEvents(ArrayList<Event> events){
    if (events.isEmpty()) {
        System.out.println("No hay ningún Evento registrado");
    }else{
        System.out.println("\n Listado de Eventos:");
        for (int i= 0; i< events.size(); i++){
            System.out.println("(i +1)" + events.get(i).toString());
            System.out.println("   ");
        }
    }
    }
    }

