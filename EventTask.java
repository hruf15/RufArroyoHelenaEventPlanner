public class EventTask {
    private String text;
    private boolean isCompleted;

    public EventTask(String text) {
        this.text = text;
        this.isCompleted = false;
    }

    public boolean isCompleted() {
        return isCompleted;

        @Override
        public String toString () {
            return text + " - " + (isCompleted ? "Completada" : "Pendiente");
        }
    }
}