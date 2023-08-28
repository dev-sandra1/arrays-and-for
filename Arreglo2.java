import java.util.Scanner;

public class Arreglo2 {
     public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numbers[] = new int[3]; //any123
        numbers[0] = 5;
        numbers[1] = 6;
        numbers[2] = 7;

        int multiplicationNum = 3;

        for(int i=0; i<numbers.length; i++){
           System.out.println(numbers[i] * multiplicationNum);
        }
    }
}

