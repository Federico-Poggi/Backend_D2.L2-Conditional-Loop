package Es1;
import java.util.Scanner;
public class Main1 {
    static Boolean pariDispari(String parole) {
        return parole.length() % 2 == 0;
    }

    static Boolean annoBisistile(long anno) {
        long rest = anno % 4;
        long annoMod = anno % 400;
        long annoDivisibilePerCento=anno%400;
        if (annoMod==0){
            if (annoDivisibilePerCento==0){
                return rest == 0;
            }
        }
        return false;
    }






    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        {
            String parolaDaVerificare;
            System.out.println("Inserisci una parola");
            parolaDaVerificare=scanner.nextLine();
            if (pariDispari(parolaDaVerificare))
                System.out.println("Il valore numerico della tua stringa è pari");
            else
                System.out.println("Il valore numerico della tua stringa è dispari");
        }

        {
            long anno;
            System.out.println("Inserisci un numero");
            anno=Integer.parseInt(scanner.nextLine());
            if(annoBisistile(anno))
                System.out.println("Anno bisestile");
            else
                System.out.println("Anno non bisestile");
        }

        }
    }
