package Clase2;

import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        float peso;
        int edad;

/*        System.out.print("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre+ "!!!");

        System.out.print("Ingrese su peso:");
        peso = sc.nextFloat();
        System.out.println("Hola " + nombre+ ". Su peso es de " + peso + " kilos.");

        System.out.print("Ingrese su edad:");
        edad = sc.nextInt();
        System.out.printf("Hola %s. Su peso es de %.2f kilos y su edad es %d", nombre, peso, edad);*/

        System.out.println("Operaciones con potencia");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(5,6));

        System.out.println("Operaciones con raiz cuadrada");
        double cateto1, cateto2, hiponenusa;
        System.out.println("Ingrese cateto1:");
        cateto1 = sc.nextDouble();
        System.out.println("Ingrese cateto2:");
        cateto2 = sc.nextDouble();

        hiponenusa = Math.sqrt( Math.pow(cateto1,2 ) + Math.pow(cateto2,2));
        System.out.println(hiponenusa);

    }
}
