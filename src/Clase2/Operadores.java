package Clase2;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alumno;
        float nota1, nota2;

        System.out.println("Ingrese alumno:");
        alumno = sc.nextLine();

        System.out.println("Ingrese nota 1:");
        nota1 = sc.nextFloat();
    }

    public static boolean isMayor(int nota){
        return nota > 12;
    }
}
