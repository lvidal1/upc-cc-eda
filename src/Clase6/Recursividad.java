package Clase6;

import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base, exponente;

        System.out.println("Base:");
        base= sc.nextInt();

        System.out.println("Potencia:");
        exponente = sc.nextInt();

       // System.out.println("Usando For:");
      //  System.out.printf( "La %d elevado a la %d es: %d", base, exponente, potenciaConFor(base, exponente));

        System.out.println("Usando Recursividad:");
        System.out.printf( "La %d elevado a la %d es: %f", base, exponente, potenciaConRecursividad(base, exponente));
    }

    public static double potenciaConFor( int base, int potencia ){
        long resultado = 1;
        for (int i = 0; i < potencia; i++) {
            resultado *=base;
        }
        return resultado;
    }

    public static double potenciaConRecursividad( int base, int exponente ){
        if( exponente == 0){
            return 1;
        }else if( exponente < 0) {
            return potenciaConRecursividad( base, exponente + 1) /base;
        } else {
            return base * potenciaConRecursividad( base, exponente - 1);
        }
    }
}
