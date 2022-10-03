package Mrt.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {


        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2);//ondaligi almaz

        double dd=55;
        System.out.println(dd/sayi2);// buyugun dedigi olur  // byte < short < int < long < float < double
        byte b=127;
        int i=b ;//k<b aotoweiding islemi(aw)
        System.out.println(i);
        int num =1453;
        double d1= num;
        System.out.println(d1);


        System.out.println(d1/num); // iki farkli datatype sayi isleme girerse java buyuk olana tipte data gelir- (aw)
        /* task->
                * Kullanicidan bir character girmesini isteyin ve
                * girilen karakteri ve ascii degerini yazin
                *
         * Ornek : Input  : a
                *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
                *
         *
         */
        Scanner sc = new Scanner(System.in);//1. adim
        System.out.println("1 karakter giriniz : ");//2. adı
        char ch=sc.nextLine().charAt(0);
        int chasci=ch;
        System.out.println(chasci);


    }
}
