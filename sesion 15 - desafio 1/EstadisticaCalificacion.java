import java.util.Arrays;

public class EstadisticaCalificacion {

    public static void main(String[] args) {
        String[] calificacion = new String[10];
        double calificacionnumero = 0;
        int cantaprobado = 0, cantdesaprobado = 0, cantexcelente = 0;
        double suma_notas = 0;

        for (int i = 0; i < calificacion.length; i++) {
            calificacionnumero = Math.random() * 12.0;

            if (calificacionnumero < 4.0) {
                cantdesaprobado++;
            } else if (calificacionnumero >= 4 && calificacionnumero < 10) {
                cantaprobado++;
            } else {
                cantexcelente++;
            }

            // calificacion[i] = Double.toString(calificacionnumero);
            calificacion[i] = String.format("%.1f", calificacionnumero);

        }

        double[] desaprobado = new double[cantdesaprobado];
        double[] aprobado = new double[cantaprobado];
        double[] excelente = new double[cantexcelente];

        cantaprobado = 0;
        cantdesaprobado = 0;
        cantexcelente = 0;

        for (int i = 0; i < calificacion.length; i++) {
            calificacion[i] = calificacion[i].replace(",", "."); // hay que hacerlo para poder convertirlo a double

            calificacionnumero = Double.parseDouble(calificacion[i]);
            suma_notas = suma_notas + calificacionnumero;
            if (calificacionnumero < 4.0) {
                desaprobado[cantdesaprobado] = calificacionnumero;
                cantdesaprobado++;
            } else if (calificacionnumero >= 4 && calificacionnumero < 10) {
                aprobado[cantaprobado] = calificacionnumero;
                cantaprobado++;
            } else {
                excelente[cantexcelente] = calificacionnumero;
                cantexcelente++;
            }

        }

        // double redondeado = Math.round(numero * 10) / 10.0;
        System.out.println("Total Notas: " + Arrays.toString(calificacion));

        System.out.println("Desaprobados: " + Arrays.toString(desaprobado));
        System.out.println("Aprobados: " + Arrays.toString(aprobado));
        System.out.println("Excelentes: " + Arrays.toString(excelente));

        double promDesaprobados = Arrays.stream(desaprobado).average().orElse(0.0)*10;
        double promAprobado = Arrays.stream(aprobado).average().orElse(0.0)*10;
        double promExcelente = Arrays.stream(excelente).average().orElse(0.0)*10;


        System.out.println("Promedio Total: " + suma_notas / 10);
        //System.out.println("Promedio Desaprobado (sin redondeo): " + Arrays.stream(desaprobado).average().orElse(0.0));
        System.out.println("Promedio Desaprobado: " + (Math.ceil(promDesaprobados))/10);
        System.out.println("Promedio Aprobado: " + (Math.ceil(promAprobado))/10);
        System.out.println("Promedio Excelente: " + (Math.ceil(promExcelente))/10);
        // System.out.println(Arrays.stream(arreglo).average());

    }

}
