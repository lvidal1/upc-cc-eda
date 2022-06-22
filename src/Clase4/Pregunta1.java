package Clase4;

import java.time.LocalDate;

public class Pregunta1 {

    public static void main(String[] args) {

        char genero[] = {'M', 'M', 'F', 'F'};
        int nacimiento[] = {1990, 1985, 1994, 2002};

        System.out.println(obtenerPorcentajeEdadImpar(nacimiento));
    }

    public static int getPeopleAbove30(int nacimiento[], char genero[]){

        int cantidad = 0;

        for (int i = 0; i < nacimiento.length; i++) {
            if (30 < obtenerPersonaEdad(nacimiento[i])  && genero[i] == 'F') {
                cantidad +=1;
            }
        }

        return cantidad;
    }

    public static int obtenerPersonaEdad(int nacimiento){
        return (LocalDate.now()).getYear() - nacimiento;
    }

    public static double obtenerPorcentajeEdadImpar(int nacimiento[]){

        int cantidad = 0;

        for (int i = 0; i < nacimiento.length; i++) {
            if (obtenerPersonaEdad(nacimiento[i]) % 2 != 0) {
                cantidad +=1;
            }
        }
        System.out.println(cantidad);
        return cantidad * 100 / nacimiento.length   ;
    }
}
