package Clase5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        // Print
        System.out.println("Tamaño de la cola es:" + queue.size());
        System.out.println(queue);

        // Iterate
        for (String item:queue) {
            System.out.println(item);
        }

        // Delete and get the first element on queue
        System.out.println("Eliminando :"+ queue.poll());
        System.out.println("Queda :" + queue);

        // Get the first value but not delete it
        System.out.println(queue.peek());

        // Iterate queue (Alternative)
        while (!queue.isEmpty()){
            System.out.println("Item: " + queue.poll());
        }
        System.out.println("La cola final es: "+ queue);

        // Removes all items from collection
        queue.clear();

        queue.offer("x");
        queue.offer("y");

        System.out.println("La cola luego de limpiar y agregar: "+ queue);
    }
}
