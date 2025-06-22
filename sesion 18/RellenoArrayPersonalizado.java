/*crea un método llamado "rellenarArray(int[] array)" que recibirá como parámetro un arreglo de tipo "int" y no devolverá ningún valor. Este método contendrá la lógica necesaria para solicitar datos al usuario y completar el arreglo con ellos.
 */
/*1. Escribe un programa en Java que realice lo siguiente:
- Solicita al usuario un tamaño para un arreglo.
- Luego, pídele que ingrese un número con el que desea rellenar el array.
- Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
- El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.

Asegúrate de validar lo siguiente:
- La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0. (??????)
- Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar pidiendo al usuario nuevos números e índices para rellenar el arreglo.
- El índice siempre debe ser menor que el tamaño total del arreglo.
- Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe ser mayor que el último índice ingresado; a su vez, se debe rellenar el array con el nuevo número desde el índice anterior hasta el nuevo índice.
Por último, el programa debe imprimir por consola el arreglo completo.
 */

import java.util.Arrays;
import java.util.Scanner;

public class RellenoArrayPersonalizado {

    public static Scanner sc = new Scanner(System.in);
    public static int indice=0;  
    public static int indiceInicio = 0;

    public static void main(String[] args) {
        System.out.println("Indica el tamaño del arreglo:");
        int tamanio = sc.nextInt();
        int arr[] = new int[tamanio];
        rellenarArray(arr, tamanio);        
    }

    public static void rellenarArray(int[] arr, int tamanio){

        
        do {
            System.out.println("Indica un número entero con el que quieres rellenarlo:");
            int num = sc.nextInt();       
            indice = obtenerIndice(tamanio);
            Arrays.fill(arr, indiceInicio, indice+1, num); //Assigns the specified int value to each element of the specified range of the specified array of ints. (int[] a, int fromIndex, int toIndex, int val)
            indiceInicio = indice;
            imprimirArreglo(arr);
        } while (indice < arr.length-1);

    }

    public static int obtenerIndice(int tamanio){           
          
        do {
            System.out.println("Ingresa el índice hasta el cual se va a rellenar:");
            indice = sc.nextInt();
            if (indice <= indiceInicio) {
                System.out.println("El índice debe ser mayor: "+ indiceInicio);
            }
            if (indice >= tamanio) {
                System.out.println("Indice debe ser menor a :" + tamanio);
            }
            
        } while (indice <= indiceInicio || indice >= tamanio);
        
        return indice;
    }

    public static void imprimirArreglo(int [] arr){
        System.out.println("El arreglo es: " + Arrays.toString(arr));
    }
}
