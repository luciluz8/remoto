package practica5;
import java.util.Scanner;

public class version_1_0 {	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar datos del estudiante
	        System.out.println("Ingrese los datos del estudiante:");
	        System.out.print("Nombre: ");
	        String nombre = scanner.nextLine();
	        
	        System.out.print("Apellidos: ");
	        String apellidos = scanner.nextLine();
	        
	        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
	        String fechaNacimiento = scanner.nextLine();
	        
	        System.out.print("DNI: ");
	        String dni = scanner.nextLine();
	        
	        System.out.print("Estudios previos: ");
	        String estudiosPrevios = scanner.nextLine();
	        
	        System.out.print("Teléfono: ");
	        String telefono = scanner.nextLine();

	        // Mostrar los datos del estudiante
	        System.out.println("\nDatos del estudiante:");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellidos: " + apellidos);
	        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
	        System.out.println("DNI: " + dni);
	        System.out.println("Estudios previos: " + estudiosPrevios);
	        System.out.println("Teléfono: " + telefono);

	        scanner.close();
	    }
	}
