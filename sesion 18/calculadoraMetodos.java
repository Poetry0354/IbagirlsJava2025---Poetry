/**
 * Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un
 * método llamado "menu()" que no reciba ningún parámetro y se encargue de
 * generar la lógica de mostrar el menú de opciones y producir el bucle para
 * seguir mostrando el menú hasta seleccionar la opción de "salir". Solicita dos
 * números al usuario y realiza la operación matemática seleccionada, teniendo
 * en cuenta las validaciones necesarias como la división por cero.
 *
 * Aquí te recordamos cuál era la actividad:
 * 1. Solicita al usuario que ingrese dos números y almacena estos valores en
 * variables previamente declaradas.
 * 2. Declara una variable para almacenar el resultado de la operación.
 * 3. Permite al usuario elegir qué operación quiere realizar.
 * 4. Muestra el resultado de la operación en la consola.
 * 
 */
public class calculadoraMetodos {

  public static void main(String[] args) {
    menu();
    calculo(0, 0, 0); // Llamada inicial para evitar error de compilación

  }

  public static void menu() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    boolean condition = true;
    while (condition) {
      try {
        System.out.println("Calculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 5) {
          condition = false;
          System.out.println("¡Hasta luego!");
          break;
        }

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        calculo(opcion, num1, num2);

      } catch (Exception e) {
        System.out.println("Entrada no válida. Intenta de nuevo.");
        scanner.nextLine(); // Limpiar el buffer
      }
    }
    scanner.close();
  }

  public static void calculo(int opcion, double num1, double num2) {
    double resultado = 0;
    switch (opcion) {
      case 1:
        resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);
        break;
      case 2:
        resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);
        break;
      case 3:
        resultado = num1 * num2;
        System.out.println("Resultado de la multiplicación: " + resultado);
        break;
      case 4:
        if (num2 == 0) {
          System.out.println("Error: División por cero no permitida.");
        } else {
          resultado = num1 / num2;
          System.out.println("Resultado de la división: " + resultado);
        }
        break;
      default:
        System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
    }

  }

}
