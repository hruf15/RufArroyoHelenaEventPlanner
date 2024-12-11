import java.util.Scanner;

public class Main {

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
            break;
        case 2:
            System.out.println("\nHa escogido borrar Evento");
            break;
        case 3:
            System.out.println("\nHa escogido Listar evento");
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

