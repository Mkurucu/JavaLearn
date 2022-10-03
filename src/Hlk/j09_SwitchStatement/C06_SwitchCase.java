package Hlk.j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //girilen gunun hafta ici mi sonu mu
        Scanner scan =new Scanner(System.in);
        System.out.println("hafta gnunu girin:");
        String gun = scan.next().toLowerCase();

        switch (gun){
            case "pazartesi":

            case "sali":

            case "carsamba":

            case "persembe":

            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":

            case "pazar":
                System.out.println("haftasonu ");
                break;
            default:
                System.out.println("hatali giris lutfen dogru girin");
        }







    }
}
