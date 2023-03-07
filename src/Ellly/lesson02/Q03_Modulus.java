package Ellly.lesson02;

import java.util.Scanner;

public class Q03_Modulus {

    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 14353453532345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamakli sayi giriniz : ");
        int sayi = scan.nextInt();

        int ilkIkiSayi = sayi /1000; //12   12345 bine 1000  son 3 basamagi sildik elimizde 12 kaldi. kac basamak varsa o kadar 0 gerekli.
        int sonIkiSayi = sayi %100;  //45    kalini almak icin % kullanilir.



        int ilkIkiSayiTop = (ilkIkiSayi/10) + (ilkIkiSayi%10); //1+2



        int sonIkiSayiTop = (sonIkiSayi/10) + (sonIkiSayi%10); //4+5
        System.out.println(ilkIkiSayiTop); //3
        System.out.println(sonIkiSayiTop); //9
        System.out.println("esas toplam :" + (ilkIkiSayiTop + sonIkiSayiTop)); //esas toplam :12


        ///


    }






}
