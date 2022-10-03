package j08_if;

import java.io.Serializable;
import java.util.Scanner;

public class C05_ternoryOperator {
    public static void main(String[] args) {
// TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir"
// print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas = scan.nextInt();

        //ifelse yontem
       // if (yas %2==0) {
        //    System.out.println("cift");
       // }else System.out.println("tek");

        //ternary yontem
        System.out.println (yas%2==0 ? yas/2:"girilen sayı tek oldugu için yarısı tamsayı değildir") ;


        //ternary yontem
       // Serializable  sonuc = (yas%2==0 ? "girilen sayı tek oldugu için yarısı tamsayı değildir") ;
        //System.out.println (sonuc) ;









    }
}
