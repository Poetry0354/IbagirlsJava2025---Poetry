import java.util.Arrays;

public class ManipulandoOracion {
    public static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static String[] palabra;
    public static String[] ordenar;

    public static void main(String[] args) {
       menu();
    }

    public static void menu() {
        String opcionOracion="";
        String oracion="";
        int contar;
        int palabra1;
        boolean salir= false;
        
        try {
            System.out.println("-------------Menu-------------");
            do { 
                opcionOracion=oracion.isBlank() ? "Crear oración" : "Borrar oración";
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
                       oracion=CrearBorrar(oracion);
                        System.out.println("su oracion es: " + oracion);
                    }
                    case 2 -> {
                        contar=CantidadCaracteres(oracion);
                        System.out.println(" la cantidad total de caracteres en la oración es : " + contar);
                    }
                    case 3 -> {
                        palabra=Palabras(oracion);
                        palabra1=CantidadPalabras(palabra);
                        System.out.println("la cantidad de palabras en la oración es : " + palabra1 );
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

                        System.out.println("El resultado del módulo es: "  );
                    }
                    case 6 -> {
                        System.out.println("Gracias por utilizar la calculadora.");

                    }
                    case 7 -> {
                        System.out.println("Gracias por utilizar la calculadora.");

                    }
                    case 8 -> {
                        System.out.println("Gracias por utilizar la calculadora.");

                    }
                    case 9 -> {
                        System.out.println("Gracias por utilizar la calculadora.");
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
    
    public static String CrearBorrar(String oracion){
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

    

}
