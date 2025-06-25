/*Tabla de multiplicar 2.0
En esta actividad, vas a crear un programa que solicita al usuario que ingrese 3 números (incluida la lógica en un método llamado pedirNumeros())  y luego imprime la tabla de multiplicar de cada uno de ellos  1 al 10 (incluida la lógica en un método llamado imprimirTablasMultiplicar(int[] numeros)). Para ello, implementarás un array para almacenar los números ingresados y luego invocarás el método para cada uno de ellos.
 */

 import java.util.Scanner;

public class EjercicioCuatro {
  public static Scanner myScanner = new Scanner(System.in);
  public static void main(String[] args) {   

    int numeros[] = new int[3];
    llenarArray(numeros);
    // Llamar metodo para mostrar la tabla
    imprimirTablasArray(numeros);
    myScanner.close();
  }

  public static void llenarArray(int[] arrayNumeros) { 

    for (int i = 0; i < arrayNumeros.length; i++) {
      System.out.println("Ingrese un número en la posición "+ (i+1));
      arrayNumeros[i] = myScanner.nextInt();
      myScanner.nextLine();
    }
    
  }

  public static void imprimirTablasArray(int[] arrayNumeros) {
    for (int i : arrayNumeros) {
      imprimirTablaMultiplicar(i);
      System.out.println("-----------------------------");
    }
  }

  public static void imprimirTablaMultiplicar(int numero) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }

}