package Homework.Tarea3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {

    // Console colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static final int TYPE_PAR = 1;

    public static final int TYPE_IMPAR = 2;

    public static void main(String[] args) {

        int max, min, quantity;
        Queue<Integer> cola1 = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        logBlueTitle("#  Queue: Análisis de números 2022   #"  );

        System.out.println("¿Cuántos números desea evaluar en la cola?");
        quantity = input.nextInt();

        System.out.println("¿Cúal es el límite inferior del rango de números?");
        min = input.nextInt();

        System.out.println("¿Cúal es el límite superior del rango de números?");
        max = input.nextInt();

        for (int i = 0; i < quantity; i++) {
            cola1.add(generateRandomNumber(min,max));
        }

        logBlueSubtitle("*---------- Resultados ---------*"  );

        System.out.println("Las números generados aleatoriamente son: ");
        System.out.println(cola1 + "\n");

        logYellowSubTitle("1. El promedio de los números es: ");
        System.out.println(calculateAverage(cola1) + "\n");

        logYellowSubTitle("2. Los números luego de remover múltiplos de 3 y 5 son: ");
        cola1.removeIf(Colas::isMultiplyOfThreeOrFive);
        System.out.println(cola1 + "\n");

        logYellowSubTitle("3. Comparación de sumas");
        compareSumOfNumbers(cola1);
    }

    public static double calculateAverage(Queue<Integer> numbers){

        int accumulator = 0;

        for (Integer number : numbers) {
            accumulator += number;
        }
        return (double) accumulator / numbers.size();
    }

    public static int generateRandomNumber(int min, int max){
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static boolean isMultiplyOfThreeOrFive(int number){
        return number % 3 == 0 || number % 5 == 0;
    }

    public static void compareSumOfNumbers(Queue<Integer> numbers){
        int oddSum = getSumOfNumbers( TYPE_IMPAR , numbers);
        int evenSum = getSumOfNumbers( TYPE_PAR  , numbers);

        System.out.println("La suma de números IMPAR es: "+ oddSum);
        System.out.println("La suma de números PAR es: "+ evenSum);

        if( oddSum > evenSum ){
            System.out.println("La suma impar es mayor que la par");
        }else{
            System.out.println("La suma par es mayor que la impar");
        }
    }

    public static int getSumOfNumbers(int type, Queue<Integer> numbers){

        int sum = 0;

        for (Integer number : numbers) {
            if(type == TYPE_PAR && number % 2 == 0){
                sum += number;
            }
            if(type == TYPE_IMPAR && number % 2 != 0){
                sum += number;
            }
        }
        return sum;
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
