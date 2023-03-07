package Mrt.deneme;

import java.util.Scanner;

public class ocak13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("scanner griniz " );
        int sayi = sc.nextInt();

        System.out.println(sayi);

        if ( sayi<0||sayi>100){
            System.out.println(sayi+" sayisi hatali lutfen 0 ile 100 arasi bir sayi giriniz");}
        else if (sayi>=0 && sayi<30){
            System.out.println(sayi+" ile CC aldiniz");}
        else if (sayi>=30 && sayi<40){    System.out.println(sayi+" ile CC aldiniz");}

        else if (sayi>=40 && sayi<50){
            System.out.println(sayi+" ile DC aldiniz");}
        else if (sayi>=50 && sayi<60){
            System.out.println(sayi+" ile CC aldiniz");}
        else if (sayi>=60 && sayi<70){
            System.out.println(sayi+" ile BC aldiniz");}

       else if (sayi>=70 && sayi<80){
            System.out.println(sayi+" ile BB aldiniz");}

       else if (sayi>=80 && sayi<90){
            System.out.println(sayi+" ile AB aldiniz");}

       else if  (sayi>=90 && sayi<100){
            System.out.println(sayi+" ile AA aldiniz");}



        int not = 85;
        int vize = 80;
        String sonuc = (not + vize) / 2 >= 70 ? "Geçtiniz." : "Kaldınız.";
        System.out.println(sonuc);
    }



}
