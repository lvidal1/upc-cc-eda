package Clase7;

public class TorreHanoi {

    public static void main(String[] args) {
        int n = 10; // Number of disks
        torreHanoi(n, 'A', 'C', 'B');
    }

    public static void torreHanoi(int numDiscos, char origen, char aux, char destino){

        if(numDiscos == 1){
            System.out.println("Move disk 1 from torre " +  origen + " to torre " + destino);
        }else{
            torreHanoi( numDiscos - 1, origen, destino, aux);
            System.out.println("Move disk " + numDiscos + " from torre " +  origen + " to torre " + destino);
            torreHanoi(numDiscos - 1, aux, destino, origen);
        }
    }
}
