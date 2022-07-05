package Clase8;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println("Do binary search");

        int  arreglo [] = {5,7,8,10,12,20,40,60,70};
        System.out.println(binarySearch(arreglo, 5));

        int valorABuscar = 5;

        System.out.println(binarySearchRecursive(arreglo, 0, arreglo.length-1 , 5));

    }

    public static int binarySearch(int arr[], int value){

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while(firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            System.out.println("Index: "+middleIndex);

            if(arr[middleIndex] == value){
                return middleIndex;
            } else if (arr[middleIndex] < value) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > value) {
                lastIndex = middleIndex - 1;

            }
        }
        return -1;

    }

    public static int binarySearchRecursive(int arr[], int firstIndex, int lastIndex, int value){

        if(firstIndex <= lastIndex ){
            int middleIndex = (firstIndex + lastIndex) / 2;
            System.out.println("Index: "+middleIndex);

            if(arr[middleIndex] == value){
                return middleIndex;
            } else if (arr[middleIndex] < value) {
                return binarySearchRecursive(arr, middleIndex + 1, lastIndex, value);
            }

            return binarySearchRecursive(arr, firstIndex, middleIndex - 1, value);

        }
        return -1;

    }

}
