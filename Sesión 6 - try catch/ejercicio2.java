import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese un numero");
        try {
            String caracter=sc.nextLine();
            Integer.parseInt(caracter);
            System.out.println(caracter);
/*         } catch (NumberFormatException e){
            e.getStackTrace();
            System.out.println("la cadena no se puede convertir "+ e.getMessage());    */ 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("se detecto un error: "+ e.getMessage());
        }finally{
            sc.close();
        }
    }
}
