import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada=0;
        while (entrada < 5) {
            System.out.println("""
                Ingrese un número para elegir
                1.Comprar un producto
                2. Realizar devolución
                3. Ver mis pedidos
                4. Preguntas frecuentes
                5. Salir
                """);
        entrada = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        switch (entrada) {
            case 1 -> System.out.println("Producto comprado");
            case 2 -> System.out.println("Devolución realizada");
            case 3 -> System.out.println("**Productos**");
            case 4 -> System.out.println("Preguntas frecuentes: 1, 2, 3.");
            case 5 -> {
                System.out.println("Vuelve pronto.");
                //entrada = 5;
            }
            default -> System.out.println("Opción no válida");
        }
        }
        sc.close();

    }

}