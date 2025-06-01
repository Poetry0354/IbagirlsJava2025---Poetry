/*Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. El tamaño y los números  a contener pueden ser de tu elección. */

public class ejercicio2{
    public static void main(String[] args) {
        int[] array = {540,60,32,7,25,23,4,50};
        
        int minimo = array[0];

        for (int i = 0; i < array.length; i++){            
            if (array[i] < minimo){
                minimo = array[i];                
            }
        }
        
        System.out.println("El valor mínimo del array es: "+minimo);

    }
}