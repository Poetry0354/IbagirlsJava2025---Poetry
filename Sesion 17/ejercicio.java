import java.util.Scanner;

/**
 * Imprimir nombre: Crea un método llamado imprimeNombre() que reciba por
 * parámetro un nombre y
 * luego imprima el mensaje "Mi nombre es [nombre]". Invocar dicho método desde
 * el método main para ver el mensaje por consola
 * Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int
 * edad) que reciba dos parámetros, el nombre y la edad,
 * y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".
 * 
 */
public class ejercicio {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Holaaaa, Por favor ingresa tu nombre: ");
    String nombre = myScanner.nextLine();
    System.out.println("Por favor ingresa tu edad: ");
    int edad = myScanner.nextInt();

    imprimeNombreYEdad(nombre, edad);
    System.out.println();
    imprimeNombre(nombre);
    myScanner.close();
  }

  public static void imprimeNombre(String Nombre) {
    System.out.println("Mi nombre es " + Nombre);
  }

  public static void imprimeNombreYEdad(String nombre, int edad) {
    System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
  }

}
