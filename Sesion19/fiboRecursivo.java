package Sesion19;

/**
 * fiboRecursivo
 */
public class fiboRecursivo {

  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      System.out.println(fibonacciRecursivo(i));
    }

  }

  public static int fibonacciRecursivo(int n) {
    if (n == 0) {

      return 0;
    } else if (n == 1) {

      return 1;
    } else {

      return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
    // Si n es mayor que 1, sumamos los dos números anteriores de la serie de
    // Fibonacci.
    // Así obtenemos el número de Fibonacci en la posición n.

  }

}
