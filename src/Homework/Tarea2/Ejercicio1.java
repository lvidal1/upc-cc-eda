package Homework.Tarea2;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Locale;


public class Ejercicio1 {

    private static final int MONTH_SIZE = 12;

    public static void main(String[] args) {

        double[] sales = new double[MONTH_SIZE];

        double average;

        String minMonthSale, maxMonthSale;

        Collection<String> lowerMonths;

        // Input

        System.out.println("###### Ventas de Smarthphones 2022 ######\n");

        readMonthSales(sales);

        // Process

        average = getSalesAverage(sales);

        minMonthSale = getMinMonthSale(sales);

        maxMonthSale = getMaxMonthSale(sales);

        lowerMonths = getLowerThanAverageMonths(average, sales);

        // Output

        System.out.println("*-------- Resultados -------*\n");

        System.out.println("- El mes de mayor venta es: "+ minMonthSale);

        System.out.println("- El mes de menor venta es: "+ maxMonthSale);

        System.out.printf("- El promedio de ventas es: S/ %.2f \n", average);

        System.out.println("- Los meses que no superan el promedio de ventas en el año: \n" + lowerMonths);

        System.out.println("\nGracias! Tenga un buen día.");

    }

    public static void readMonthSales(double[] monthSales){
        Scanner input = new Scanner(System.in);

        System.out.println("*-------- Ingrese datos -------*");
        for (int i = 0; i < monthSales.length; i++) {
            System.out.println("Ingresos (S/) de "+ getMonthName( i + 1) + "? ");
            monthSales[i] = input.nextDouble();
        }
    }

    private static String getMonthName(int monthIndex) {
        Month month = Month.of( monthIndex );
        return month.getDisplayName( TextStyle.FULL , new Locale("es","ES") ) ;
    }

    public static String getMinMonthSale(double[] sales){
        int monthIndex = getMinIndexSale(sales);
        return getMonthName(monthIndex);
    }

    public static String getMaxMonthSale(double[] sales){
        int monthIndex = getMaxIndexSale(sales);
        return getMonthName(monthIndex);
    }

    public static int getMinIndexSale(double[] monthSales){
        double min = monthSales[0];
        int index = -1;

        for (int i = 0; i < monthSales.length; ++i) {
            min = Math.min(min, monthSales[i]);
            if (monthSales[i] == min) {
                index = i;
            }
        }
        return index + 1;
    }

    public static int getMaxIndexSale(double[] monthSales){
        double max = monthSales[0];
        int index = -1;

        for (int i = 0; i < monthSales.length; ++i) {
            max = Math.max(max, monthSales[i]);
            if (monthSales[i] == max) {
                index = i;
            }
        }
        return index + 1;
    }

    public static double getSalesAverage(double[] monthSales){
        double sum = 0;
        if(monthSales.length > 0){
            for (int i = 0; i < monthSales.length; ++i) {
                sum += monthSales[i];
            }
            return sum / monthSales.length;
        }else{
            return sum;
        }
    }

    public static Collection<String> getLowerThanAverageMonths(double average, double[] monthSales){
        Collection<String> months = new LinkedList<String>();

        for (int i = 0; i < monthSales.length; ++i) {
            if (monthSales[i] < average) {
                months.add(getMonthName( i + 1));
            }
        }
        return months;
    }

}
