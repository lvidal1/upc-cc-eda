package Homework.Tarea3;

import java.util.Scanner;
import java.util.Stack;

public class Pilas {

    // Options
    private static final int OPTION_READ_AGE = 1;
    private static final int OPTION_CALCULATE = 2;
    // Console colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";


    public static void main(String[] args) {

        Stack<Integer> ages = new Stack<>();
        int option = OPTION_READ_AGE;

        logBlueTitle("#    Stack: Cálculo de edades 2022   #"  );

        while(option == OPTION_READ_AGE){
            ages.push( readAge() );
            option = readOptionMenu();
        }

        logBlueSubtitle("*---------- Resultados ---------*"  );

        double average = calculateAverage(ages);

        System.out.println("Las edades obtenidas son: ");
        System.out.println(ages + "\n");

        logYellowSubTitle("1. El promedio de los edades es:");
        System.out.println(average+ "\n");

        logYellowSubTitle("2. Cantidad de personas superan el promedio de edades es:");
        System.out.println(calculateHigherThanAverage(ages,average)+ "\n");

        logYellowSubTitle("3. La mayor edad es:");
        System.out.println(getMaxFromAges(ages)+ "\n");

        logYellowSubTitle("4. La menor edad es:");
        System.out.println(getMinFromAges(ages));

    }

    public static int readAge(){

        int age = 0;
        Scanner input = new Scanner(System.in);

        while (age < 1){
            System.out.println("Ingrese nueva edad (edad > 0):");
            age = input.nextInt();

            if( age < 1 ){
                logWarning("Debe ingresar una edad válida.\nIntente nuevamente.");
            }
        }
        return age;
    }

    public static int readOptionMenu(){

        int option = 0, read;
        Scanner input = new Scanner(System.in);

        while(option == 0){
            logBlueSubtitle("*------------- Menu ------------*"  );
            System.out.println("1. Agregar nueva edad");
            System.out.println("2. Calcular resultados\n");
            logYellowSubTitle("Escoja una opción: ");

            read = input.nextInt();

            if(read == OPTION_READ_AGE || read == OPTION_CALCULATE){
                option = read;
            }else{
                logWarning("Debe eligir una opción válida.\nIntente nuevamente.");
            }
        }
        return option;
    }
    public static double calculateAverage(Stack<Integer> ages){

        int accumulator = 0;

        for (Integer age : ages) {
            accumulator += age;
        }
        return (double) accumulator / ages.size();
    }

    public static int calculateHigherThanAverage(Stack<Integer> ages, double average){

        int accumulator = 0;

        for (Integer age : ages) {
            if(age > average){
                accumulator++;
            }
        }
        return accumulator;
    }

    public static int getMaxFromAges(Stack<Integer> ages) {
        int max = Integer.MIN_VALUE;

        for (Integer age : ages) {
            max = Math.max(age, max);
        }
        return max;
    }

    public static int getMinFromAges(Stack<Integer> ages) {
        int min = Integer.MAX_VALUE;

        for (Integer age : ages) {
            min = Math.min(age, min);
        }
        return min;
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

    public static void logWarning(String message){
        System.out.println( colorize("*---------- ¡Advertencia! ---------*", ANSI_YELLOW ) );
        System.out.println( message );
        System.out.println( colorize("*---------- ------------- ---------*\n", ANSI_YELLOW ) );
    }

    public static String colorize(String message, String color){
        return color + message + ANSI_RESET;
    }

}
