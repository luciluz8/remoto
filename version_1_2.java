package practica5;
import java.util.Scanner;

public class version_1_2 {

    static class Estudiante {
        String nombre;
        String apellidos;
        String fechaNacimiento;
        String dni;
        String estudiosPrevios;
        String telefono;
    }
    
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Estudiante estudiante = new Estudiante();

            // Solicitar datos del estudiante y almacenarlos en objeto Estudiante
            System.out.println("Ingrese los datos del estudiante:");
            System.out.print("Nombre: ");
            estudiante.nombre = scanner.nextLine();
            
            System.out.print("Apellidos: ");
            estudiante.apellidos = scanner.nextLine();
            
            System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
            estudiante.fechaNacimiento = scanner.nextLine();
            
            System.out.print("DNI: ");
            estudiante.dni = scanner.nextLine();
            
            System.out.print("Estudios previos: ");
            estudiante.estudiosPrevios = scanner.nextLine();
            
            System.out.print("Teléfono: ");
            estudiante.telefono = scanner.nextLine();

            // Mostrar los datos del estudiante
            System.out.println("\nDatos del estudiante:");
            System.out.println("Nombre: " + estudiante.nombre);
            System.out.println("Apellidos: " + estudiante.apellidos);
            System.out.println("Fecha de nacimiento: " + estudiante.fechaNacimiento);
            System.out.println("DNI: " + estudiante.dni);
            System.out.println("Estudios previos: " + estudiante.estudiosPrevios);
            System.out.println("Teléfono: " + estudiante.telefono);

            scanner.close();
        }
    }
}
