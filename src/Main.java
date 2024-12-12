import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

    private ArrayList<Event> events = new ArrayList<>();
    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio() {

System.out.println("Bienvenido a Event Planer");

Scanner scanner = new Scanner(System.in);
boolean exit = false;

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
            System.out.println("Ha escogido añadir Evento");
            System.out.println("Introduzca el titulo del Evento a añadir:");
            String title =scanner.nextLine();

            System.out.println("Introduzca la fecha (DD-MM-AAAA)");
            String dateInput = scanner.nextLine();
            LocalDate date = LocalDate.parse(dateInput);

            System.out.println("Introduzca la prioridad (HIGH, MEDIUM, LOW): ");
            String priorityInput = scanner.nextLine().toUpperCase();
            Event.Priority priority =Event.Priority.valueOf(priorityInput);

            Event newEvent = new Event(title,date,priority);
            events.add(newEvent);

            break;
        case 2:
            System.out.println("\nHa escogido borrar Evento");
            System.out.println("Introduzca el nombre del Evento a borrar:");
            String titleToDelete = scanner.nextLine();

            break;
        case 3:
            System.out.println("\nHa escogido Listar evento");
            if (events.isEmpty()) {
                System.out.println("No hay eventos registrados.");
            } else {
                for (int i = 0; i < events.size(); i++) {
                    System.out.println((i + 1) + ". " + events.get(i));
                }
            }

            break;
        case 4:
            System.out.println("Ha escogido Marcar/desmarcar tarea de un evento como completada");

            break;
        case 5:
            System.out.println("Ha escogido Salir. Gracias por su colaboración");
            exit = true;
            break;
        }
        }else {
                System.out.println("Opción incorrecta. Vuelva a introducir la opción deseada");
                scanner.nextLine();
            }
    }
}


}

