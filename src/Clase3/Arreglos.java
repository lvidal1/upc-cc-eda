package Clase3;

public class Arreglos {

    public static void main(String[] args) {

        String[] nombres = { "Carlos" , "Julian", "Cristian" , "Miguel", "Jose" };
        String nombresPersonas[] = new String[4];
        String [] nombresParticipantes = new String[4];
        int edad[] = new int[4];
        boolean estado[] = new boolean[4];
        String apellido [] = new String[4];

        System.out.println("Participantes:");
        for (int i = 0; i < nombres.length ; i++) {
            System.out.println("- " + nombres[i]);
        }

        System.out.println("Edades:");
        for (int i = 0; i < edad.length; i++) {
            System.out.println(edad[i]);
        }

        System.out.println("Estado:");
        for (int i = 0; i < estado.length; i++) {
            System.out.println(estado[i]);
        }

        System.out.println("Apellidos:");
        for (int i = 0; i < apellido.length; i++) {
            System.out.println(apellido[i]);
        }

    }
}
