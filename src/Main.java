import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

    private ArrayList<Event> events = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio() {

        System.out.println("Bienvenido a Event Planer");


        while (!exit) {

            System.out.println("Menú de opciones. Seleccione una opción");
            System.out.println();
            System.out.println("[1]Añadir Evento");
            System.out.println("[2] Borrar Evento");
            System.out.println("[3] Listar Eventos");
            System.out.println("[4] Marcar/desmarcar tarea de un evento como completada");
            System.out.println("[5] Salir");
            System.out.println("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                int opcionMenu = scanner.nextInt();
                scanner.nextLine();

                switch (opcionMenu) {
                    case 1:
                        anadirEvento();
                        break;
                    case 2:
                        borrarEvento();
                        break;
                    case 3:
                        listarEvento();
                        break;
                    case 4:
                        marcarEvento();
                        break;
                    case 5:
                        System.out.println("Ha escogido Salir. Gracias por su colaboración");
                        exit = true;
                        break;
                }
            } else {
                System.out.println("Opción incorrecta. Vuelva a introducir la opción deseada");
                scanner.nextLine();
            }
        }
    }
    /**
     * se añade método para añadir evento*/
    public void anadirEvento() {
        System.out.println("Ha escogido añadir Evento");
        System.out.println("Introduzca el titulo del Evento a añadir:");
        String title = scanner.nextLine();

        System.out.println("Introduzca la fecha (AAAA-MM-DD)");
        String dateInput = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateInput);

        System.out.println("Introduzca la prioridad (HIGH, MEDIUM, LOW): ");
        String priorityInput = scanner.nextLine().toUpperCase();
        Event.Priority priority = Event.Priority.valueOf(priorityInput);

        Event newEvent = new Event(title, date, priority);
        events.add(newEvent);

    }

    public void borrarEvento() {
/**
 * se añade método para borrar evento*/
        System.out.println("\nHa escogido borrar Evento");
        System.out.println("Introduzca el nombre del Evento a borrar:");
        String titleToDelete = scanner.nextLine();

        for (int i = events.size() - 1; i >= 0; i--) {
            Event event = events.get(i);
            if (event.getTitle().equalsIgnoreCase(titleToDelete)) {
                events.remove(i);
                System.out.println("Evento borrado");
                return;
            }

            System.out.println("No consta ningún evento con ese título");
        }
    }

    public void listarEvento() {
        /**
         * se añade método para listar evento*/
        System.out.println("\nHa escogido Listar evento");
        if (events.isEmpty()) {
            System.out.println("No hay eventos registrados.");
        } else {
            for (int i = 0; i < events.size(); i++) {
                System.out.println((i + 1) + ". " + events.get(i));
            }
        }

    }

    public void marcarEvento() {

        /**
         * se añade método para marcar/desmarcar evento*/
        System.out.println("Ha escogido Marcar/desmarcar tarea de un evento como completada");
        System.out.println("Introduzca el titulo del Evento marcar/desmarcar");
        System.out.println("[1] Marcar");
        System.out.println("[2] Desmarcar");
        System.out.print("Seleccione una opción: ");
        int action = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el título del evento:");
        String title = scanner.nextLine();

        System.out.println("Evento marcado/desmarcado correctamente");{

            }
        }

    }







