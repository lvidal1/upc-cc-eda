package Homework.Tarea2;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio2 {

    public static void main(String[] args) {
        int arraySize, min, max;

        System.out.println("###### Generador de Números ######\n");

        Scanner input = new Scanner(System.in);

        System.out.println("*-------- Ingrese datos -------*");

        System.out.println("Ingrese el tamaño del array:");

        arraySize = input.nextInt();

        System.out.println("Ingrese el límite inferior:");

        min = input.nextInt();

        System.out.println("Ingrese el límite superior:");

        max = input.nextInt();

        int[] numbers = generateArray(arraySize, min, max);

        System.out.println("\n*-------- Números generados -------*\n");
        System.out.println(arrToString(numbers));

        findRepeated(numbers);

        findPairs(numbers);

        findNonPairs(numbers);
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

    public static void findRepeated(int[] numbers){
         Map<Object, Long> repeated = Arrays
                 .stream(numbers)
                 .boxed()
                 .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println("\n*-------- Repeticiones -------*\n");
        System.out.println("Las ocurrencias encontradas son: \n" + repeated);
    }

    public static void findPairs(int[] numbers){
        int[] pairs = Arrays
                .stream(numbers)
                .filter(s -> s % 2 == 0)
                .toArray();

        System.out.println("\n*-------- Números pares -------*\n");

        System.out.println("Las números encontrados son: \n" + arrToString(pairs));
        System.out.println("El promedio es: \n" + getAverage(pairs));
    }

    public static void findNonPairs(int[] numbers){
        int[] nonpairs = Arrays
                .stream(numbers)
                .filter(s -> s % 2 != 0)
                .toArray();

        System.out.println("\n*-------- Números Impares -------*\n");

        System.out.println("Las números encontrados son: \n" + arrToString(nonpairs));
        System.out.println("El promedio es: \n" + getAverage(nonpairs));
    }

    public static int getAverage(int[] numbers){
        int average = 0;
        int sum = 0;

        if(numbers.length > 0){
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            average = sum / numbers.length;
        }

        return  average;
    }

    public static String arrToString(int[] numbers){
        return IntStream.of(numbers)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
    }
}



