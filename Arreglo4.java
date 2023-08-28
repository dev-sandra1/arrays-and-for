import java.util.Scanner;

public class Arreglo4 {
     public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        float numbers[] = new float[3]; //any123
        numbers[0] = 7.5f;
        numbers[1] = 6.3f;
        numbers[2] = 10;

        float total = 0;

        for(int i=0; i<numbers.length; i++){
            total += numbers[i];
        }

        System.out.println(total / numbers.length);
      
    }
}