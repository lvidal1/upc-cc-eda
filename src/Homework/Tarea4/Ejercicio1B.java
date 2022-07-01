package Homework.Tarea4;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio1B {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        int arraySize, min, max;
        Scanner input = new Scanner(System.in);

        logBlueTitle("Recursividad: Sumar elementos de arreglo"  );

        logYellowSubTitle("Ingrese el tamaño del arreglo:");

        arraySize = input.nextInt();

        logYellowSubTitle("Ingrese el límite inferior:");

        min = input.nextInt();

        logYellowSubTitle("Ingrese el límite superior:");

        max = input.nextInt();

        int[] numbers = generateArray(arraySize, min, max);

        logBlueSubtitle("\n*-------- Números generados -------*\n");
        System.out.println(arrToString(numbers));

        logBlueSubtitle("\n*-------- Suma obtenida -------*\n");
        System.out.println(sum(numbers, numbers.length));
    }

    public static int sum(int arr[], int size)
    {
        if (size <= 0){
            return 0;
        }
        return (sum(arr, size - 1) + arr[size - 1]);
    }

    public static int[] generateArray( int size, int min, int max) {
        int[] baseArray = new int[size];

        for (int i = 0; i < baseArray.length; i++) {
            baseArray[i] = generateRandomNumber(min, max);
        }

        return baseArray;
    }

    public static int generateRandomNumber(int min, int max){
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static String arrToString(int[] numbers){
        return IntStream.of(numbers)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
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
