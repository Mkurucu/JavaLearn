package Hlk.j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("ay giriniz");
        int ay = scan.nextInt();

        switch (ay){
            case 1:
                System.out.println("girilen ay ocak");
                break;
            case 2:
                System.out.println("girilen ay c  subat ");
                break;
            case 3:
                System.out.println("girilen ay c  mart ");
                break;
            case 4:
                System.out.println("girilen ay c  nisan ");
                break;
            case 5:
                System.out.println("girilen ay  c mayis ");
                break;
            case 6:
                System.out.println("girilen ay  c haziran ");
                break;
            case 7:
                System.out.println("girilen ay  c temmuz ");
                break;
            case 8:
                System.out.println("girilen ay  c agustos ");
                break;
            case 9:
                System.out.println("girilen ay  c eylul ");
                break;
            case 10:
                System.out.println("girilen ay  c ekim ");
                break;
            case 11:
                System.out.println("girilen ay  c kasim ");
                break;
            case 12:
                System.out.println("girilen ay  c aralik ");
            default:
                System.out.println("hatali giris lutfen rakam girin");
        }

    }
}
