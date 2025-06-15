/**
 * Crea un programa que utilice un método "imprimirArray(int[] array)" que se
 * encargue de imprimir un array por consola. El método debe recibir como
 * parámetro un arreglo de tipo "int" y no devolver nada. Luego, crea una
 * sobrecarga del método para que acepte arrays de tipo String y arreglos
 * bidimensionales de tipo "int" y de tipo "String".
 */
public class imprimirArray {

  public static void main(String[] args) {
    // Array del metodo 1
    int[] arrayInt = { 1, 2, 3, 4, 5 };
    System.out.println("--- Imprimiendo array de enteros (int[]) ---");
    imprimirArray(arrayInt);

    // Array para el metodo 2
    String[] arrayString = { "Hola", "Mundo", "Java" };
    System.out.println("--- Imprimiendo array de Strings (String[]) ---");
    imprimirArray(arrayString);

    // Matriz para metodo 3
    int[][] matrizDeEnteros = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
    String[][] matrizDeStrings = { { "Manzana", "Pera" }, { "Naranja", "Uva" } };
    System.out.println("--- Imprimiendo matriz de enteros y Strings (int[][], String[][]) ---");
    printMatrix(matrizDeEnteros, matrizDeStrings);
  }

  // Metodo para recibir un array de enteros
  public static void imprimirArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  // Metodo para recibir String
  public static void imprimirArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void printMatrix(int matriz1[][], String matriz2[][]) {
    for (int[] row : matriz1) {
      // traverses through number of rows
      for (int element : row) {
        // 'element' has current element of row index
        System.out.print(element + "\t");
      }
      System.out.println();
    }

    for (String[] row : matriz2) {
      // traverses through number of rows
      for (String element : row) {
        // 'element' has current element of row index
        System.out.print(element + "\t");
      }
      System.out.println();
    }
  }

}
