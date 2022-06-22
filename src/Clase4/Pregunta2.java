package Clase4;

public class Pregunta2 {

    public static void main(String[] args) {

        double[] notas = {12.5, 15.5, 17, 11, 16, 19.4, 13, 10};

        double porcentajeAprobados = obtenerPorcentajeAprobados(notas);

        System.out.println("A: El porcentaje de notas aprobadas es: " + porcentajeAprobados + " %");

    }

    public static double obtenerPorcentajeAprobados(double notas[]){

        int cantidad = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 13) {
                cantidad +=1;
            }
        }

        return cantidad * 100.0 / notas.length   ;
    }
}
