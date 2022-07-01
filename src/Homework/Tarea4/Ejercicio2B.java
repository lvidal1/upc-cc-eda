package Homework.Tarea4;

import java.util.Scanner;

public class Ejercicio2B {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        String word;
        Scanner input = new Scanner(System.in);

        logBlueTitle("#    Recursividad: Invertir frase    #");

        logYellowSubTitle("Ingrese el frase a procesar:");

        word = input.nextLine();

        logBlueSubtitle("\n*-------- Frase invertida -------*\n");
        System.out.println(reverseWord(word));
    }

    public static String reverseWord(String word)
    {
        if (word.isEmpty()){
            return word;
        }
        return reverseWord(word.substring(1)) + word.charAt(0);
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
