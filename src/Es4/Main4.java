package Es4;

import java.util.Scanner;

public class Main4 {

    void count(int start){
        int numeroTo=start;

        for(int i=start; i>=0; i--){
            System.out.println(i);
        };


    }
    Scanner scanner= new Scanner(System.in);
    public static void main(String[] args){
        int numeroToDecrease;
        //int[] numeroArray=new int[1];
        {
            System.out.println("Inserisci un numero");
            numeroToDecrease=Integer.parseInt(scanner.nextLine());
            //numeroArray[0]=numeroToDecrease;
            count(numeroToDecrease);

        }

    }
}
