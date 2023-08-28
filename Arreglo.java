import java.util.Scanner;

public class Arreglo{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String names[] = new String[4]; //any123
        names[0] = "Anna";
        names[1] = "Lola";
        names[2] = "Lila578"; 
        names[3] = "any123"; 

        for(int i=0; i<names.length; i++){
           if(names[i].equals("Lila578")){
                System.out.println("user: " + names[i] + " id: " + i );
           }
        }
    }
}