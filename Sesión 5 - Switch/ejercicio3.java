import java.util.Scanner;

public class ejercicio3 {
        public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Opción 1: Guardar");
        System.out.println("Opción 2: Cargar");
        System.out.println("Opción 3: Salir");
    
        System.out.print("Ingrese una opción: ");
        int opcion = miScanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Seleccionaste guardar");
            case 2 -> System.out.println("Seleccionaste cargar");
            case 3 -> System.out.println("Seleccionaste salir");
            default -> System.out.println("Opción inválida");
        }

        miScanner.close();
    }
}
