public class Clase1 {

    public static void main (String[] args) {

        String alias = "Michael";
        int age = 30;
        int otherAge = 21;
        int negative = -1;
        String name = "Leonardo";

        System.out.println("Mi nombre es "+ name + " y tengo " + age);

        char char1, char2;
        char1 = 'a';
        char2 = 'b';

        System.out.println("Concatenación de letra es: "+ char1 + " y "+ char2);

        final double PI = 3.1416;
        final double NE = 2.82;
        System.out.print("PI equivale a: "+PI + "\n");
        System.out.println("NE = "+ NE);


        // Casting examples
        System.out.println("Conversiones");
        String word = "1234";
        int number = Integer.parseInt(word);
        System.out.println(number);

        String word2 = "12.4";
        double decimal = Double.parseDouble(word2);
        System.out.println(decimal);

        String word3 = "12.5";
        float decimal2 = Float.parseFloat(word3);
        System.out.println(decimal2);

        int integer = 123;
        String castedWord = String.valueOf(integer);
        System.out.println(castedWord);

        String chainedWord = Integer.toString(integer);
        System.out.println(chainedWord);
    }

}
