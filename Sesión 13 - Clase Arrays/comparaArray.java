import java.util.Arrays;
/*Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.
 */

public class comparaArray {
    public static void main(String[] args) {
      int[] arreglo1= {1,2,3,4,5};
        int[] arreglo2= {1,2,7,4,5};


        if (Arrays.equals(arreglo1, arreglo2)){
            System.out.println("Los arreglos son iguales");
        }
        else {
            System.out.println("Los arreglos son diferentes");
        }
  
    }
}
