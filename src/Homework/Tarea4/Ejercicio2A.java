package Homework.Tarea4;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio2A {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        logBlueTitle("Recursividad: Sumar dígitos de un número");

        logYellowSubTitle("Ingrese el número:");

        number = input.nextInt();

        logBlueSubtitle("\n*-------- Suma obtenida -------*\n");
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number)
    {
        if (number == 0){
            return 0;
        }
        return (number % 10 + sumDigits(number/10));
    }

    public static void logBlueTitle(String message){
        System.out.println( colorize( "###################################### " , ANSI_CYAN) )  ;
        System.out.println( colorize( message, ANSI_CYAN ) );
        System.out.println( colorize( "###################################### " , ANSI_CYAN) +"\n" )  ;
    }

    public static void logYellowSubTitle(String message){
        System.out.println( colorize( message, ANSI_YELLOW ) );
    }

    public static void logBlueSubtitle(String message){
        System.out.println( colorize( message, ANSI_CYAN ) );
    }

    public static String colorize(String message, String color){
        return color + message + ANSI_RESET;
    }
}
