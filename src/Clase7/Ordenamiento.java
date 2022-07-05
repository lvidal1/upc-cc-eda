package Clase7;

public class Ordenamiento {

    public static void main(String[] args) {

        int numbers[] = {34,8,64,51,32,21};
        System.out.println("Ordenamiento por Inserción Directa");

        System.out.println(printArray(numbers));
        System.out.println(printArray(insertionSort(numbers)));
        System.out.println(printArray(selectionSort(numbers)));
    }
    
    public static String printArray(int[] array){
        String output = "";
        for (int i = 0; i < array.length; i++) {
            output += array[i] + ", ";
        }
        return output;
    }
    
    public static int[] insertionSort(int[] arr){

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){

        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
