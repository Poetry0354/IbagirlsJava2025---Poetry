import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        int numeros = 14;
        verificacion(numeros);
    }

    public static void verificacion(int numero) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número (0 para salir del programa):");
        numero = scanner.nextInt();

        do {
            boolean esPrimo = true;

            if (numero < 2) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println("El número " + numero + " es primo.");
                System.out.println("Introduce otro número (0 para salir del programa):");
                numero = scanner.nextInt();
            } else {
                System.out.println("El número " + numero + " no es primo. Inténtalo de nuevo.");
                numero = scanner.nextInt();
            }

        } while (numero != 0);

        scanner.close();
    }

}
