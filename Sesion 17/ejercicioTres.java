/*
 * 1. Tabla de multiplicar
 * En esta actividad, vas a crear un programa que solicita al usuario que
 * ingrese un número
 * (incluida la lógica en un método llamado pedirNumero()) y luego imprime la
 * tabla de multiplicar
 * de ese número del 1 al 10 (incluida la lógica en un método llamado
 * imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba el número ingresado por el
 * usuario y que imprima la tabla de multiplicar correspondiente.
 * 
 */

import java.util.Scanner;

public class ejercicioTres {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    int numero = pedirNumero(myScanner);
    // Llamar metodo para mostrar la tabla
    imprimirTablaMultiplicar(numero);

    myScanner.close();
  }

  public static int pedirNumero(Scanner myScanner) {
    System.out.println("ingrese un número");
    return myScanner.nextInt();
  }

  public static void imprimirTablaMultiplicar(int numero) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }

}
