import java.util.Scanner;

public class figurasGeometricas {

  public static void main(String[] args) {

  }

  // Metodos de menus
  public static void menuDeFiguras() {
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;
    do {
      System.out.println("Hola Por favor, sigue el menu y selecciona una opción:");
      System.out.println("1. Círculo");
      System.out.println("2. Cuadrado");
      System.out.println("3. Rectángulo");
      System.out.println("4. Triángulo");
      System.out.println("5. Salir");
      System.out.print("Selecciona una opción: ");
      opcion = scanner.nextInt();
      switch (opcion) {
        case 1:
          // Lógica para Círculo
          menuOperaciones();
          break;
        case 2:
          // Lógica para Cuadrado
          break;
        case 3:
          // Lógica para Rectángulo
          break;
        case 4:
          // Lógica para Triángulo
          break;
        case 5:
          System.out.println("Saliendo del programa...");
          return; // Salir del método
        default:
          System.out.println("Opción no válida, por favor intenta de nuevo.");
      }
    } while (opcion != 5);
    scanner.close();
  }

  public static void menuOperaciones() {

  }

  // Operaciones para las Figuras
  public static void operaciones() {

  }
}
