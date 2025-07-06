public class EsPrimoRecursivo {
    public static void main(String[] args) {
       java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Introduce un número (0 para salir del programa):");
        int numero = scanner.nextInt();
        while (numero != 0) {
            if (esPrimoRecursivo(numero, numero - 1)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
            System.out.println("Introduce otro número (0 para salir del programa):");
            numero = scanner.nextInt();
        }
        scanner.close();
    }

    public static boolean esPrimoRecursivo(int numero, int divisor) {
        if (numero < 2)
            return false;
        if (divisor == 1)
            return true;
        if (numero % divisor == 0)
            return false;
        return esPrimoRecursivo(numero, divisor - 1);
    }
}

