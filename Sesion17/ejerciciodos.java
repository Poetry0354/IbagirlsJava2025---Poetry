import java.util.Scanner;

public class ejerciciodos {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       String nombre=obtenerNombre();
       int edad=obtenerEdad();
       imprimeNombreYEdad(nombre, edad);
       sc.close();
    }

    public static void imprimeNombreYEdad(String nombre, int edad){
        System.out.println(nombre + " " + edad);

    }

    public static String obtenerNombre()  {
        System.out.println("ingrese su nombre");
        return sc.nextLine();
    }

    public static int obtenerEdad()  {
        System.out.println("ingrese su edad");
        return sc.nextInt();
    }

}
