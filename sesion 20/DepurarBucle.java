// Crea un programa que use un bucle fori para iterar a través de un array de 
// números y calcular la suma de todos los números en el array.
// Coloca un punto de interrupción dentro del bucle.
// Ejecuta el programa en modo debug y observa cómo cambian los valores de "suma" y "número" en cada iteración usando 
// el “step over”.
// Luego vuelve a ejecutar el programa pero utiliza un “breakpoint condicional” para que 
// el programa se detenga en el anteúltimo índice del array

public class DepurarBucle {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7 };
        int acumulador = 0;
        for (int i = 0; i < numeros.length; i++) {
            acumulador += numeros[i];
            System.out.println(numeros[i]);            
        }
        System.out.println(acumulador);
    }
}



