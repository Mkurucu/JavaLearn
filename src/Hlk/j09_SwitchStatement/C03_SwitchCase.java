package Hlk.j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.println("ay giriniz");
            int ay = scan.nextInt();

            switch (ay){
                case 1:
                    System.out.println("girilen ay 31");
                    break;
                case 2:
                        System.out.println("subat ayindsiniz artik yildan dolayi lutfen yil girin");
                        int yil = scan.nextInt();
                        if (yil%4==0){
                        System.out.println("bu ay  29 ");
                        }else System.out.println("bu ay 28 ");
                    break;
                case 3:
                    System.out.println("bu ay  31 ");
                    break;
                case 4:
                    System.out.println("bu ay  30 ");
                    break;
                case 5:
                    System.out.println("bu ay 31 ");
                    break;
                case 6:
                    System.out.println("bu ay 30 ");
                    break;
                case 7:
                    System.out.println("bu ay 30 ");
                    break;
                case 8:
                    System.out.println("bu ay 31 ");
                    break;
                case 9:
                    System.out.println("bu ay 30 ");
                    break;
                case 10:
                    System.out.println("bu ay 31 ");
                    break;
                case 11:
                    System.out.println("bu ay 30 ");
                    break;
                case 12:
                    System.out.println("bu ay 31 ");
                default:
                    System.out.println("hatali giris lutfen dogru ay girin");
            }
    }
}
