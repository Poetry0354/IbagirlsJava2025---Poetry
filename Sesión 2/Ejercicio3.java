import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        // A. Compara si el primer número ingresado es mayor al segundo número
        // ingresado.
        int numero1;
        int numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos números");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        System.out.println("El número " + numero1 + " es mayor a " + numero2 + " ?");
        System.out.println("Resultado: " + (numero1 > numero2));

        // B. Verifica si el primer número ingresado es distinto al segundo número
        // ingresado . Muestra el resultado en consola.

        System.out.println("El número " + numero1 + " es distinto a " + numero2 + " ?");
        System.out.println("Resultado: " + (numero1 != numero2));

        // C. Verifica si el primer número ingresado es divisible por 2 . Muestra el
        // resultado en consola.

        System.out.println("El número " + numero1 + " es divisible por 2?");
        String respuesta = (numero1 % 2 == 0) ? "Sí, es divisible por 2" : "No, no lo es.";
        System.out.println("Resultado: " + respuesta);

        /*
         * 2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes
         * validaciones:
         * A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
         * B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
         */

        System.out.println("Ingrese otros 2 números enteros: ");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        System.out.println("El número " + numero1 + " es mayor a " + numero2 + " y el número " + num3
                + " es mayor al número " + num4 + " ?");
        System.out.println("Resultado: " + (numero1 > numero2 && num3 > num4));

        System.out.println("El número " + numero1 + " es mayor a " + numero2 + " o el número " + num3
                + " es mayor al número " + num4 + " ?");
        System.out.println("Resultado: " + (numero1 > numero2 || num3 > num4));
    }
}
