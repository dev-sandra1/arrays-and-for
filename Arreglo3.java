import java.util.Scanner;

public class Arreglo3 {
     public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numbers[] = new int[10]; //any123
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        //15243

       // System.out.println(numbers[numbers.length - 1]); //numbers[5]

       int startIndex = 0;
       int endIndex = numbers.length - 1; //9
       
       while (startIndex <= endIndex) {
           if (startIndex == endIndex) {
               System.out.println(numbers[startIndex]);
           } else {
               System.out.println(numbers[startIndex] + " " + numbers[endIndex]);
           }
           
           startIndex++; //
           endIndex--;//8
       }
    }
}
