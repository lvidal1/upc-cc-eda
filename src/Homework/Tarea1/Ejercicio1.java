package Homework.Tarea1;

import java.util.Scanner;

public class Ejercicio1 {

    private static final int PRODUCT_ARROZ = 1;
    private static final int PRODUCT_AZUCAR = 2;
    private static final int PRODUCT_CAFE = 3;

    public static void main(String[] args) {

        int mainOption;

        System.out.println("###### Supermercado Mess ######\n");

        mainOption = readMainOptionMenu();

        if(mainOption == 1){
            executeGetBaseProductPrice();
        }
        if(mainOption == 2){
            executeGetSellProductPrice();
        }

        System.out.println("\nGracias! Tenga un buen día.");
    }

    /*
     * Ejecuta la lectura de la operación a realizar
     * */
    public static int readMainOptionMenu(){
        int option = 0, read;
        Scanner input = new Scanner(System.in);

        while(option == 0){
            System.out.println("*-------- Menu Principal -------*");
            System.out.println("1. Obtener precio base del producto");
            System.out.println("2. Obtener precio de venta por día");
            System.out.println("Escoja una opción:");
            read = input.nextInt();

            if(read == 1 || read == 2){
                option = read;
            }else{
                System.out.println("Elija una opción válida. Intente nuevamente\n");
            }
        }
        return option;
    }

    /*
     * Ejecuta la lectura de la opción para el ID del producto
     * */
    public static int readProductOption(){
        int option = 0, read;

        Scanner input = new Scanner(System.in);

        while(option == 0){
            System.out.println("*---- Productos disponibles -----*");
            System.out.println("1. Arroz");
            System.out.println("2. Azúcar");
            System.out.println("3. Cafe");
            System.out.println("Escoja una opción:");
            read = input.nextInt();

            if(read == PRODUCT_ARROZ || read == PRODUCT_AZUCAR || read == PRODUCT_CAFE){
                option = read;
            }else{
                System.out.println("Elija una opción válida. Intente nuevamente\n");
            }
        }
        return option;
    }

    /*
     * Ejecuta la lectura de la opción para el día de compra
     * */
    public static int readDayOfBuyOption(){
        int option = 0, read;

        Scanner input = new Scanner(System.in);

        while(option == 0){
            System.out.println("*-------- Día de Compra ---------*");
            System.out.println("Ingrese un día del mes. Intervalo [1-30]:");
            read = input.nextInt();

            if(read > 0 && read < 31){
                option = read;
            }else{
                System.out.println("Ingrese una opción válida. Intente nuevamente\n");
            }
        }
        return option;
    }

    /*
     * Ejecuta el calculo del precio vase del producto
     * */
    public static void executeGetBaseProductPrice(){
        int product;
        product = readProductOption();
        System.out.printf("El precio base de %s es: S/ %.1f \n", getProductName(product), getBaseProductPrice(product));
    }

    /*
     * Ejecuta el calculo del precio de venta del producto en un día del mes
     * */
    public static void executeGetSellProductPrice(){
        int product;
        int dayOfBuy;
        product = readProductOption();
        dayOfBuy = readDayOfBuyOption();
        System.out.printf("El precio de venta de %s es: S/ %.1f \n", getProductName(product), getSellPrice(product,dayOfBuy));
    }

    /*
     * Obtiene el nombre del producto usando el ID del producto
     * */
    public static String getProductName(int product){
        return switch (product) {
            case PRODUCT_ARROZ -> "Arroz";
            case PRODUCT_AZUCAR -> "Azucar";
            case PRODUCT_CAFE -> "Cafe";
            default -> "";
        };
    }

    /*
     * Obtiene el precio del producto base usando el ID del producto
     * */
    public static float getBaseProductPrice(int product){
        return switch (product) {
            case PRODUCT_ARROZ -> 50;
            case PRODUCT_AZUCAR -> 120;
            case PRODUCT_CAFE -> 90;
            default -> 0;
        };
    }

    /*
    * Obtiene el precio de venta usando el ID del producto y el día de compra
    * */
    public static float getSellPrice(int product, int dayOfBuy){

        float percentDiscount = 0;

        if(dayOfBuy >=1 && dayOfBuy <= 7){
            percentDiscount = getFirstPeriodDiscount(product);
        }
        if(dayOfBuy >=8 && dayOfBuy <= 14){
            percentDiscount = getSecondPeriodDiscount(product);
        }
        if(dayOfBuy >=15 && dayOfBuy <= 21){
            percentDiscount = getThirdPeriodDiscount(product);
        }
        if(dayOfBuy >=22 && dayOfBuy <= 30){
            percentDiscount = getForthPeriodDiscount(product);
        }
        return getBaseProductPrice(product) * (100 - percentDiscount) / 100;
    }

    /*
     * Obtiene el descuento del producto en el primer periodo
     * */
    public static int getFirstPeriodDiscount(int product){
        return switch (product) {
            case PRODUCT_ARROZ -> 10;
            case PRODUCT_AZUCAR -> 8;
            case PRODUCT_CAFE -> 5;
            default -> 0;
        };
    }

    /*
     * Obtiene el descuento del producto en el segundo periodo
     * */
    public static int getSecondPeriodDiscount(int product){
        return switch (product) {
            case PRODUCT_ARROZ -> 5;
            case PRODUCT_AZUCAR -> 12;
            case PRODUCT_CAFE -> 8;
            default -> 0;
        };
    }

    /*
     * Obtiene el descuento del producto en el tercero periodo
     * */
    public static int getThirdPeriodDiscount(int product){
        return switch (product) {
            case PRODUCT_ARROZ -> 8;
            case PRODUCT_AZUCAR -> 10;
            case PRODUCT_CAFE -> 5;
            default -> 0;
        };
    }

    /*
     * Obtiene el descuento del producto en el cuarto periodo
     * */
    public static int getForthPeriodDiscount(int product){
        return switch (product) {
            case PRODUCT_ARROZ -> 20;
            case PRODUCT_AZUCAR -> 15;
            case PRODUCT_CAFE -> 18;
            default -> 0;
        };
    }
}
