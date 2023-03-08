package HLK_OrS1.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sayi alin

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int num = scan.nextInt();
        System.out.println("*****  TERNARY çözümü  *****");

        String result = (num >= 0) ? (num < 10 ? "Normalsin!" : "Buyuksun!") : ("negatif sayı");
        System.out.println(result);

        System.out.println("*****  if  çözümü  *****");

        if (num >= 0) {
            if (num < 10) {
                System.out.println("rakam");

            } else System.out.println("pozitif sayı");

        } else System.out.println("negatif sayı");

    }
}