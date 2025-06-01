import java.util.Scanner;

public class ejercicio4 {
      public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);
    System.out.println("Hola, Por favor ingresa un número del 1 al 3.");

    int opcion = miScanner.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Selecionaste para calcular el area del círculo");

        System.out.print("Ingresa el radio del círculo: ");
        double radio = miScanner.nextDouble();
        double area = 3.14 * (radio * radio);

        System.out.println("Esta es la area del Círculo: " + area);
        break;

      case 2:
        System.out.println("Seleccionaste para calcular el area del cuadrado");

        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = miScanner.nextDouble();
        double areaCuadrado = lado * lado;

        System.out.println("El área del cuadrado es: " + areaCuadrado);
        break;

      case 3:
        System.out.println("Seleccionaste para calcular el area del triángulo");

        System.out.println("Por favor ingresa la base: ");
        double base = miScanner.nextDouble();
        System.out.println("Por favor ingresa la altura: ");
        double altura = miScanner.nextDouble();

        double areaTriangulo = (base * altura) / 2;

        System.out.println("Esta es la area del triángulo: " + areaTriangulo);
        break;

      default:
        System.out.println("Opción inválida. Ingresa un número del 1 al 3.");
        break;
    }

    miScanner.close();
  }
}
