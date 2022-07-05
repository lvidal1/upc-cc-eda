package Clase7;

public class Busqueda {

    public static void main(String[] args) {

        int numbers[] = {34,8,64,51,32,21};
        int valor = 51;

        System.out.println(busquedaSecuencial(numbers,valor));
        System.out.println(busquedaSecuencialOrdenada(numbers,valor));
    }

    public static String printArray(int[] array){
        String output = "";
        for (int i = 0; i < array.length; i++) {
            output += array[i] + ", ";
        }
        return output;
    }

    public static int busquedaSecuencial( int arr[], int valor){
        int i = 0;
        while (i < arr.length){
            if(arr[i] == valor){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int[] ordenamientoPorSeleccion(int arreglo[]){
        int n = arreglo.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arreglo[j] < arreglo[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arreglo[min_idx];
            arreglo[min_idx] = arreglo[i];
            arreglo[i] = temp;
        }

        return arreglo;
    }

    public static int busquedaSecuencialOrdenada( int arreglo[], int valor){

        // 1. Ordenamos el array con el Ordenamiento por selección
        arreglo = ordenamientoPorSeleccion(arreglo);

        // 2. Con el arreglo ordenado, realizamos la búsqueda secuencial
        return busquedaSecuencial(arreglo, valor);
    }


}
