package Sesion19;

/**
 * factorial2Parte
 * Metodos para calcular el factorial de un número.
 *
* ¡Siguiente parte! Recursividad.
 */
import java.util.Scanner;

public class factorial2Parte {

  // Método iterativo para calcular el factorial
  public static int factorial(int numero) {
    int resultado = 1;
    for (int i = 1; i <= numero; i++) {
      resultado *= i;
    }
    return resultado;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¡¡Bienvenido!! por favor, ingresa un número:  ");
    int numero = sc.nextInt();

    while (numero < 0) {
      System.out.println("El número debe ser positivo.");
      System.out.println("Por favor, ingresa un número: ");
      numero = sc.nextInt();
    }

    int resultado = factorial(numero);
    System.out.println("El factorial de " + numero + " es: " + resultado);
    sc.close();
  }

}
