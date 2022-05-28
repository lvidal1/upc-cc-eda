package Clase2;

import java.util.Scanner;

public class Selectivas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Ingrese numero 1:");
        numero1 = sc.nextInt();

        System.out.println("Ingrese numero 2:");
        numero2 = sc.nextInt();

        System.out.println("Resultado:");
        analyzeIf(numero1, numero2);
    }

    public static void analyzeIf ( int n1, int n2 ){
        if(n1 > n2){
            System.out.printf("%d es mayor que %d", n1, n2);
        }else{
            if(n1 < n2) {
                System.out.printf("%d es menor que %d", n1, n2);
            }else{
                System.out.printf("%d es igual que %d", n1, n2);
            }
        }
    }

}
