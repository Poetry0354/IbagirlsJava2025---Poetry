public class ejercicio4 {
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * (100 - 1 + 1) + 1);            
        }

        for (int numero : numerosAleatorios) {
            System.out.println(numero);
        }
    }
}
