package Es4;

import java.util.Scanner;

public class Main4 {
    static Scanner scanner= new Scanner(System.in);
   static void count(int start){
        for(int i=start; i>=0; i--){
            System.out.println(i);
        };


    }

    public static void main(String[] args){
        int numeroToDecrease;

        {
            System.out.println("Inserisci un numero");
            numeroToDecrease=Integer.parseInt(scanner.nextLine());
            count(numeroToDecrease);

        }

    }
}
