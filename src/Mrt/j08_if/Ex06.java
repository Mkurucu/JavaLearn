package Mrt.j08_if;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("cinsiyet kadin ici k erkek icin e giriniz ");
        char ch = sc.next().charAt(0);

        System.out.print("yas giriniz : ");
        int yas = sc.nextInt();

        //System.out.println("+ için -> 1 seciniz \n- için -> 2 seçiniz \n* için -> 3 seciniz\n/ için -> 4 seciniz");
        //int secim = sc.nextInt();

        if (ch == 'K') {
            if (yas > 60) {
                System.out.println("prim gununu giriniz");
                int primGunu = sc.nextInt();
                if (primGunu > 6000) {
                    System.out.println("hanimefendi emekli oldunuz.");
                } else if (primGunu < 6000) {
                    System.out.println("hanimefendi emeklilige daga " + (6000 - primGunu));
                }
            }
            else {
                    System.out.println("hanimefendi emeklilige daga " + (60 - yas));
                }
            }

        else if (ch == 'E')
                if (yas > 60) {
                    System.out.println("prim gununu giriniz");
                    int primGunu = sc.nextInt();
                    if (primGunu > 6000) {
                        System.out.println("hanimefendi emekli oldunuz.");
                    } else if (primGunu < 6000) {
                        System.out.println("hanimefendi emeklilige daga " + (6000 - primGunu));
                    }
                }
                else {
                        System.out.println("hanimefendi emeklilige daga " + (60 - yas));
                    }
                else {
                    System.out.println("dogru kaarkter girin");}
    }
}

