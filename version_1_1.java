package practica5;
import java.util.ArrayList;
import java.util.Scanner;

public class version_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> datosEstudiante = new ArrayList<>();

        // Solicitar datos del estudiante y almacenarlos en ArrayList
        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        datosEstudiante.add(scanner.nextLine());
        
        System.out.print("Apellidos: ");
        datosEstudiante.add(scanner.nextLine());
        
        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
        datosEstudiante.add(scanner.nextLine());
        
        System.out.print("DNI: ");
        datosEstudiante.add(scanner.nextLine());
        
        System.out.print("Estudios previos: ");
        datosEstudiante.add(scanner.nextLine());
        
        System.out.print("Teléfono: ");
        datosEstudiante.add(scanner.nextLine());

        // Mostrar los datos del estudiante
        System.out.println("\nDatos del estudiante:");
        for (String dato : datosEstudiante) {
            System.out.println(dato);
        }

        scanner.close();
    }
}


