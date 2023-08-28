import java.util.Scanner;

public class Arreglo5 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numbers[] = new int[5];

        for(int i=0; i<numbers.length ; i++){

           System.out.print(  i+ "-type a number: ");
           numbers[i] = entry.nextInt();
        }

        int descreciente = 0;
        int crecientes = 0;
        int equal =0;

        for(int i=0; i<numbers.length - 1; i++){

            if(numbers[i] > numbers[i + 1] ){//10
                descreciente++; 
            }else if(numbers[i] == numbers[i + 1]){
               equal ++;
  
            } else if(numbers[i] < numbers[i + 1]){
                 crecientes ++;
            }
        }

        if(descreciente == 4) {
            System.out.println("Decreciente");
        }else if(crecientes == 4 ){
            System.out.println("creciente");
        }else if(equal == 4){
            System.out.println("equal");
        }else{
            System.out.println("desordenado");
        }



    }
}
