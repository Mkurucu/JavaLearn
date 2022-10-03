package Hlk.j11_MethodCreation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("ad : ");
        String ad=sc.next();

        System.out.print("soyad : ");
        String soyad=sc.next();


        ebikGbik(ad,soyad);
        System.out.println(ebikGbik2(ad,soyad));

    }
//1. yontem
    private static void ebikGbik(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println(ad+ " "+ soyad);

    }
//2.yontem
    private static String ebikGbik2(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        return ad+ " "+ soyad;

    }
}
