import java.util.Arrays;

public class ManipulandoOracion {
  public static java.util.Scanner sc = new java.util.Scanner(System.in);
  public static String[] palabra;
  public static String[] ordenar;

  public static void main(String[] args) {
    menu();
  }

  public static void menu() {
    String opcionOracion = "";
    String oracion = "";
    int contar;
    int palabra1;
    boolean salir = false;

    try {
      System.out.println("-------------Menu-------------");
      do {
        opcionOracion = oracion.isBlank() ? "Crear oración" : "Borrar oración";
        System.out.println("""
            Ingresa la operación que deseas realizar:
            1. %s
            2. Cantidad de caracteres de la oración
            3. Cantidad de palabras de la oración
            4. Mostrar palabras ordenadas alfabéticamente
            5. Ingresar un número y devolver la palabra correspondiente
            6. Buscar palabra dentro de la oración
            7. Modificar palabra dentro de la oración
            8. Agregar contenido a la oración
            9. Salir
            """.formatted(opcionOracion));
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
          case 1 -> {
            oracion = CrearBorrar(oracion);
            System.out.println("su oracion es: " + oracion);
          }
          case 2 -> {
            contar = CantidadCaracteres(oracion);
            System.out.println(" la cantidad total de caracteres en la oración es : " + contar);
          }
          case 3 -> {
            palabra = Palabras(oracion);
            palabra1 = CantidadPalabras(palabra);
            System.out.println("la cantidad de palabras en la oración es : " + palabra1);
          }
          case 4 -> {
            palabra = Palabras(oracion);
            String[] ordenadas = ordenarAlfa(palabra);
            System.out.println("Palabras ordenadas alfabéticamente:");
            for (String p : ordenadas) {
              System.out.println(p);
            }
          }
          case 5 -> {

            validacionOracion(oracion);

            System.out.println("Hay " + palabra.length
                + " palabras. Ingresa un número segun la palabra que quieras ver (1 hasta " + palabra.length
                + "): ");

            // Se almacena el numero pedido
            int numeroPedido = sc.nextInt();
            sc.nextLine();

            if (numeroPedido < 1 || numeroPedido > palabra.length) {
              System.out
                  .println("Número fuera de rango. Por favor, ingresa un número entre 1 y " + palabra.length);
            } else {
              System.out
                  .println("La palabra en la posición " + numeroPedido + " es: " + palabra[numeroPedido - 1]);
            }
          }
          case 6 -> {
            validacionOracion(oracion);
            System.out.println("Ingresa la palabra que deseas buscar: ");
            String buscada = sc.nextLine().trim();
            existePalabra(oracion, buscada);
          }
          case 7 -> {
            validacionOracion(oracion);
            modificarOracion(oracion);
          }
          case 8 -> {
            // oracion = oracion + " " + nuevoContenido;
            agregarContenido(oracion);
          }
          case 9 -> {
            System.out.println("Gracias por usarnos");
            salir = true;
          }
        }
      } while (salir == false);

    } catch (ArithmeticException e) {
      System.out.println("No se puede dividir por cero: " + e.getMessage());
      // TODO: handle exception
    } catch (Exception e) {
      System.out.println("Hubo un error: " + e.getMessage());
    }

  }

  public static String CrearBorrar(String oracion) {
    if (oracion.isBlank()) {
      System.out.println("ingrese una oracion: ");
      return sc.nextLine();
    } else {
      return "";
    }
  }

  public static int CantidadCaracteres(String oracion) {
    return oracion.length();
  }

  public static String[] Palabras(String oracion) {
    String[] palabras = oracion.trim().split("\\s+");
    return palabras;
  }

  public static int CantidadPalabras(String[] palabras) {
    return palabras.length;
  }

  public static String[] ordenarAlfa(String[] palabra) {
    Arrays.sort(palabra);
    return palabra;
  }

  public static void validacionOracion(String oracion) {
    palabra = Palabras(oracion);
    // Validacion
    if (palabra.length == 0) {
      System.out.println("No hay nada para analizar, por favor crea una oración segun el menu");
    }
  }

  public static void existePalabra(String oracion, String buscada) {
    if (oracion.contains(buscada)) {
      System.out.println("La palabra " + buscada + " fue encontrada.");
      System.out.println("Se encuentra en la posición: " + (oracion.lastIndexOf(buscada) + 1));
      ;
    } else {
      System.out.println("La palabra " + buscada + " no se encuentra.");
    }
  }

  public static void modificarOracion(String oracion) {

    if (oracion.isBlank()) {
      System.out.println("No hay oración para modificar.");
    } else {
      // Solicita al usuario la palabra que desea modificar en la oración
      System.out.println("Ingrese la palabra que desea modificar:");
      String palabraModificar = sc.nextLine();
      // Verifica si la palabra existe en la oración
      if (oracion.contains(palabraModificar)) {
        // Solicita la nueva palabra para reemplazar la anterior
        System.out.println("Ingrese la nueva palabra:");
        String nuevaPalabra = sc.nextLine();
        // Reemplaza la palabra antigua por la nueva en la oración
        oracion = oracion.replace(palabraModificar, nuevaPalabra);
        System.out.println("Oración modificada: " + oracion);
      } else {
        // Informa si la palabra no se encuentra en la oración
        System.out.println("La palabra no se encuentra en la oración.");
      }
    }
  }

  public static void agregarContenido(String oracion) {
    System.out.println("Ingresa el contenido que quieres agregar a la oración:");
    String nuevoContenido = sc.nextLine();
    oracion = oracion.concat(" " + nuevoContenido);
    System.out.println("La nueva oración es: " + oracion);
  }

}
