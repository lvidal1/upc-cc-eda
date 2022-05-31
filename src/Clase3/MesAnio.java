package Clase3;

import java.util.Calendar;
import java.util.Scanner;

public class MesAnio {

    public static void main(String[] args) {
        //Ejercicio del día de la semana

        String[] diasDeLaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana: ");

        int dia = sc.nextInt();

        System.out.println("Es el día: " + diasDeLaSemana[dia - 1]);

        //Variación: que muestre automáticamente que día es


        Calendar fecha = Calendar.getInstance();

        System.out.println("Calendar.DATE: " + fecha.get(Calendar.DATE));
        System.out.println("Calendar.MONTH: " + fecha.get(Calendar.MONTH));
        System.out.println("Calendar.YEAR: " + fecha.get(Calendar.YEAR));
        System.out.println("Calendar.DAY_OF_WEEK: " + fecha.get(Calendar.DAY_OF_WEEK));
        //System.out.println("LocalDate.now()" + LocaleDate.now().getDayOfWeek().getValue());

        int [] datos = { 10 , 150, 120, 0 ,20};
        buscarElemento(datos, 20);
        maximo(datos);

        calcularPromedio();
    }

    public static void buscarElemento(int[] datos, int elemento){

        for (int i = 0; i < datos.length; i++) {

            if (datos[i] == elemento) {
                System.out.println("El elemento "+elemento+" se encuentra en el indice "+i);
            }

        }

    }

    public static void maximo(int[] datos){
        int max = -1;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > max) {
                max = datos[i];
            }
        }

        System.out.println("El máximo es: "+ max);
    }

    public static int obtenerMax(int[] datos){
        int max = -1;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > max) {
                max = datos[i];
            }
        }

       return max;
    }

    public static void calcularPromedio(){

        int numeros[] = new int[10];

        System.out.println("*-------- Menu Principal -------*");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número: "+ (i + 1));
            numeros[i] = input.nextInt();
        }

        System.out.println("El promedio de los positivos es: "+ obtenerPromedioPositivos(numeros));
        System.out.println("El promedio de los negativos es: "+ obtenerPromedioNegativos(numeros));
    }

    public static float obtenerPromedioPositivos(int[] numeros){
        int suma = 0, iterador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                suma += numeros[i];
                iterador++;
            }
        }

        if(iterador == 0){
            return  0;
        }else{
            return suma / iterador;
        }


    }

    public static float obtenerPromedioNegativos(int[] numeros){
        int suma = 0, iterador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                suma += numeros[i];
                iterador++;
            }
        }

        if(iterador == 0){
            return  0;
        }else{
            return suma / iterador;
        }
    }
}


