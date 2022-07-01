package Homework.Tarea4;

import java.util.Scanner;

public class Ejercicio1A {

    // Console colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        int height, width;
        String symbol = "*";
        Scanner input = new Scanner(System.in);

        logBlueTitle("#  Recursividad: Dibujar rectángulo  #"  );

        logYellowSubTitle("¿Cuál es la altura del rectángulo?");
        height = input.nextInt();

        logYellowSubTitle("¿Cuál es el ancho del rectángulo?");
        width = input.nextInt();

        logYellowSubTitle("¿Cúal es el símbolo a usar? ( Por defecto: * )");
        symbol = input.next();

        logBlueSubtitle("*---------- Resultado ---------*"  );

        logYellowSubTitle(draw(height,width, symbol));
    }


    public static String draw(int height, int width, String symbol){
        String drawing = "";

        if(height > 0){
            for (int i = 0; i < width; i++) {
                drawing += symbol;
            }
            drawing += draw(--height, width, symbol);
        }

        return "\n" + drawing ;
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
