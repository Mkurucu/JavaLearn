package Mrt.If.tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("ehliyet varsa E yoksa H giriniz");
        char ehliyetdurumu = scanner.nextLine().charAt(0);

        if (ehliyetdurumu == 'E' || ehliyetdurumu == 'e') {
            System.out.println("ehliyet yili giriniz");
            int yil = scanner.nextInt();

            if (yil >= 7) {
                System.out.println("mesafe giriniz");
                int mesafe = scanner.nextInt();
                if (mesafe >= 100000) {
                    System.out.println("Araba senindir");

                } else {
                    System.out.println(100000 - mesafe + "mesafe daha yapman lazim");
                }


            } else {
                System.out.println(7 - yil + " yilin daha var");
            }


        } else if (ehliyetdurumu == 'H' || ehliyetdurumu == 'h') {
            System.out.println("ehliyetin yok alamazsin");


        } else {
            System.out.println("dogru karakter giriniz");
        }


    }
}
