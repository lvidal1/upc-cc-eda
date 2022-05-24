package Clase2;

public class Modularidad {
    public static void main(String[] args) {
        pow();
        System.out.println(sqrt());

        //Un método static solo puede acceder a variables o métodos declarados como static
        System.out.println("Llamado a Procedimiento");
        sumarNumeros();

        System.out.println("Llamado a Función");
        System.out.println(sumarNumerosEntero());
        System.out.println("Uso de parámetros y argumentos");

        //Llamado a procedimiento con parámetros
        sumarNumerosProc(4, 5);

        //Llamado a función con parámetros
        System.out.println(sumarNumerosEnteros(4, 5));
        System.out.println(sumarNumerosEnteros(10, 30));
    }

    public static void pow(){
        System.out.println((int)Math.pow(5,3));
    }

    public static int sqrt(){
        return (int) Math.sqrt(144);
    }

    //Creamos un procedimiento

    public static void sumarNumeros(){
        int numero1 = 3;
        int numero2 = 5;
        int total = numero1 + numero2;
        System.out.println(total);
    }

    public static void sumarNumerosProc(int numero1, int numero2){
        int total = numero1 + numero2;
        System.out.println(total);
    }

    //Creamos una función
    public static int sumarNumerosEntero(){
        int numero1 = 3;
        int numero2 = 5;
        return  numero1 + numero2;
    }

    public static int sumarNumerosEnteros(int numero1, int numero2){
        return numero1 + numero2;
    }

}
