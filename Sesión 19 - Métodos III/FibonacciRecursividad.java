/*Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. La serie de 
Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.
La serie de Fibonacci comienza de la siguiente manera:
Posición 0: 0
Posición 1: 1
Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)
Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)
Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)
Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3.
 */

public class FibonacciRecursividad {
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
      System.out.print("Valor de N: "+ n);  
      System.out.print(" N - 1: "+(n-1));
      System.out.println(" N - 2: "+(n-2));
      return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
    // Si n es mayor que 1, sumamos los dos números anteriores de la serie de
    // Fibonacci.
    // Así obtenemos el número de Fibonacci en la posición n.

  }
}