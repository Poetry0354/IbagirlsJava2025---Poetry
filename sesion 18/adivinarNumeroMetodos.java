
/**
 * Adivinar el número: Basándose en el ejercicio que ya has realizado, crea un
 * método "numeroAleatorio()" que reciba por parámetro dos variables de tipo
 * "int": un número máximo y un número mínimo. El método debe generar y devolver
 * un número aleatorio dentro del rango especificado.
 * 
 * Ejercicio anterior: “Adivinando un número” Escribe un programa que genere un
 * número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote
 * que adivines ese número utilizando un bucle do-while. El programa te indicará
 * si el número que ingresas es mayor o menor que el número aleatorio, y seguirá
 * pidiéndote que adivines hasta que lo hagas correctamente.
 * 
 * 
 */

import java.util.Scanner;

public class adivinarNumeroMetodos {

  /**
   * Método principal que ejecuta el juego de adivinar el número.
   * Solicita al usuario un rango de números y le permite adivinar un número
   * aleatorio
   * generado dentro de ese rango.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bienvenido al juego de adivinar el número!");

    // Solicita al usuario el número mínimo y máximo para generar un número
    // aleatorio
    System.out.print("Ingresa el número mínimo: ");
    int numeroMin = scanner.nextInt();
    System.out.print("Ingresa el número máximo: ");
    int numeroMax = scanner.nextInt();

    // Genera un número aleatorio dentro del rango especificado
    int numeroAleatorio = numeroAleatorio(numeroMax, numeroMin);
    int numeroUsuario;

    do {
      System.out.print("Adivina el número entre " + numeroMin + " y " + numeroMax + ": ");
      numeroUsuario = scanner.nextInt();
      if (numeroUsuario < numeroAleatorio) {
        System.out.println("El número es mayor.");
      } else if (numeroUsuario > numeroAleatorio) {
        System.out.println("El número es menor.");
      }
    } while (numeroUsuario != numeroAleatorio);
    System.out.println("¡Felicidades! Has adivinado el número: " + numeroAleatorio);
    scanner.close();
  }

  /**
   * Genera un número aleatorio entre numeroMin (incluido) y numeroMax (incluido).
   * Lanza una excepción si el mínimo no es menor que el máximo.
   *
   * @param numeroMax Límite superior del rango
   * @param numeroMin Límite inferior del rango
   * @return Número aleatorio dentro del rango
   */

  public static int numeroAleatorio(int numeroMax, int numeroMin) {
    if (numeroMin >= numeroMax) {
      throw new IllegalArgumentException("El número mínimo debe ser menor que el número máximo.");
    }
    return (int) (Math.random() * (numeroMax - numeroMin + 1)) + numeroMin;
  }

}
