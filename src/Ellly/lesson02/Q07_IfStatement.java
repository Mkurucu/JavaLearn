package Ellly.lesson02;

import java.util.Scanner;

public class Q07_IfStatement {

   /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu aliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		 */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("yasinuzi giriniz");
        int yas = scanner.nextInt();
        System.out.println("kilonuzu  giriniz");
        int kilo = scanner.nextInt();


        if (yas < 18) {
            System.out.println("Kab bagisi yapamzsiniz 18 yasindan kucukksunuz");
        } else if (yas >= 18 && kilo < 50) {
            System.out.println("kilonuz 50 den az kan bagisi yapamazsiniz");
        } else if (yas >= 18 && kilo >= 50) {
                System.out.println("kan bagisi yapabilirsiniz");

            }
        }
    }
