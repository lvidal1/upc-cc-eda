public class HolaMundo {

    public static void main(String[] args){
        int edad = 21;
        double numeroFavorito = 2.5;
        double peso = 70.5;
        double talla = 1.72;
        String nombre = "Juan Perez";
        String nacionalidad = "Peruana";

        int numeroFavoritoEntero = (int) numeroFavorito;
        System.out.println("Hi nombre es " + nombre);
        System.out.println("Tengo de edad: " + edad);
        System.out.println("Mi nimero favorito es " + numeroFavoritoEntero + " y esta en decimales");
        System.out.printf("Mi peso es %f kilos \n", peso);
        System.out.printf("Mi talla es %.2f metros \n", talla);
        System.out.printf("Mi número favorito es %d \n", numeroFavoritoEntero);
        System.out.printf("Mi nacionalidad es %s ", nacionalidad);

    }
    
}