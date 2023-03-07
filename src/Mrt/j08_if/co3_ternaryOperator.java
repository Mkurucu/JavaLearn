package Mrt.j08_if;

import java.util.Scanner;

public class co3_ternaryOperator {
    public static void main(String[] args) {

/* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas = scan.nextInt();

        //ifelse yontem
        if (yas %2==0) {
            System.out.println("cift");
        }else System.out.println("tek");

        //ternary yontem
        System.out.println (yas%2==0 ? "cift":"tek") ;


        //ternary yontem
        String sonuc = (yas%2==0 ? "cift":"tek") ;
        System.out.println (sonuc) ;


    }
}
