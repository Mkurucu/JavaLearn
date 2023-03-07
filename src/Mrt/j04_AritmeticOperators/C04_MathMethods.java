package Mrt.j04_AritmeticOperators;

import java.util.Random;

public class C04_MathMethods {
    public static void main(String[] args) {

        /*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

    Math.max(a, b)
    Girilen iki degerden buyuk olani verir.

    Math.min(a, b)
    Girilen iki degerden kucuk olani verir.


    Girilen degerin en yakin tamsayiya yuvarlar.

    Math.sqrt(a)
    Girilen degerin karekokunu verir.

    Math.pow(a, b)
    Girilen a ve b degerini a uzeri b olarak verir.

    Math.ceil(a) 3.1 => 4
    Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

    Math.floor(a) 3.7 => 3
    Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.



     */
        /* 81 sayısının karekökünü alalım */

        System.out.println("81'ün karekök değeri : " + Math.sqrt(81));
        System.out.println("81'ün : " + Math.min(81,34));
        System.out.println("81'ün : " + Math.max(81,234));
        System.out.println("81'ün : " + Math.pow(81,2));
        System.out.println("81'ün : " + Math.round(Math.random()*(-10)));

        Random rand = new Random();
        int randSayi = rand.nextInt(10);
        System.out.println("randSayi = " + randSayi);
    }
}
