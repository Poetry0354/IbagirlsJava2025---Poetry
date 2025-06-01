import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);
    
        System.out.print("Ingrese un número entre 0 y 100: ");
        int num = miScanner.nextInt();

        if (num >= 90 && num <= 100) {
            System.out.println("La nota es A");

        } else if (num >= 80 && num <= 89) {
            System.out.println("La nota es B");

        } else if (num >= 70 && num <= 79) {
            System.out.println("La nota es C");

        } else if (num >= 60 && num <= 69) {
            System.out.println("La nota es D");

        } else if (num < 60) {
            System.out.println("La nota es F");
            
        } else {
            System.out.println("El número ingresado esta fuera del rango");
        }

        miScanner.close();
    }
}

