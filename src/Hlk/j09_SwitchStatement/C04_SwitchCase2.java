package Hlk.j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase2 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("ay girin");
        int ay = scan.nextInt();






        switch (ay){
            case 12:
            case 1:
            case 2:
                System.out.println("kis ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar ");


            default:
                System.out.println("hatali giris lutfen rakam girin");
        }















    }









}
