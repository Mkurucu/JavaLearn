package Mrt.j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir" );

        int sayi= scan.nextInt();

        int birler = sayi%10;
        sayi/=10;

        int onlar = sayi%10;
        int yuzler =sayi/=10;

        System.out.println(birler+onlar+yuzler);
    }



}
