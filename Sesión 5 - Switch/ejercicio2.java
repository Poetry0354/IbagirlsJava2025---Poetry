import java.util.Scanner;

public class ejercicio2 {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 5: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Opción no válida");
              
        }
        sc.close();
    }
}
