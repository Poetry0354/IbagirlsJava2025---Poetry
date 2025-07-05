package Sesion19;

/**
 * Ejercicio:
 * Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y
 * devuelva un valor entero que corresponda al cálculo del factorial del número
 * proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de
 * manera recursiva.
 */

/* 
 * Ejercicio Anterior: 
 *  El objetivo de esta actividad es desarrollar un programa que solicite al usuario ingresar un número 
 *  y posteriormente calcule su factorial mediante un bucle do-while. El factorial de un 
 *  número se define como el producto de todos los enteros desde 1 hasta ese número. A continuación, 
 *  te presentamos  algunos ejemplos para mayor claridad:
- El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.
- El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como resultado 120.
- Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 *   4 * 5 * 6 * 7, que da 5040.
*/
import java.util.Scanner;

public class factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¡¡Bienvenido!! por favor, ingresa un número:  ");
    int numero = sc.nextInt();

    // Do while para validar el número
    do {
      if (numero < 0) {
        System.out.println("El número debe ser positivo.");
        System.out.println("Por favor, ingresa un número: ");
        numero = sc.nextInt();
      }
    } while (numero < 0);
    System.out.println("El número ingresado es: " + numero);

    // Do While para hacer el calculo
    int resultadoFactorial = 1;
    do {
      for (int i = 1; i <= numero; i++) {
        resultadoFactorial *= i;
      }
      System.out.println("El factorial de " + numero + " es: " + resultadoFactorial);

    } while (resultadoFactorial == numero);
    sc.close();
  }
}
