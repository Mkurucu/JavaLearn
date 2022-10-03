package Hlk.j11_MethodCreation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        double sayı1 = sc.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        double sayı2 = sc.nextDouble();
        System.out.print("islem giriniz ");
        char islem = sc.next().charAt(0);

        System.out.print(islem);
        if  (islem = '+') {System.out.println(toplama(sayı1, sayı2));}
        else if (islem == "-") {System.out.println(cikar(sayı1, sayı2));}
        else if (islem == "*") {System.out.println(carp(sayı1, sayı2));}
        else if (islem == "/") {System.out.println(bol(sayı1, sayı2));}
        else System.out.println("hatali giris");

    }
    private static double toplama(double sayı1, double sayı2) {
        return (sayı1+sayı2);
    }
    private static double cikar(double sayı1, double sayı2) {
        return (sayı1-sayı2);
    }
    private static double carp(double sayı1, double sayı2) {
        return (sayı1*sayı2);
    }
    private static double bol(double sayı1, double sayı2) {
        return (sayı1/sayı2);
    }


}
