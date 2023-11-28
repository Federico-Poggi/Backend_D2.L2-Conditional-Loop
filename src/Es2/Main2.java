package Es2;

import java.util.Scanner;

public class Main2 {


    static void numberToString(int numero){
        int number;
        if ((numero>=0) && (numero<=3)){
            number=numero;
        }
        switch (numero){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;

            default:
                System.out.println("Il tuo numero non posso riscriverlo-troppo lungo");
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);




        {
            int numero;
            System.out.println("Inserisci un numero");
            numero=Integer.parseInt(scanner.nextLine());
            numberToString(numero);

        }

    }
}
