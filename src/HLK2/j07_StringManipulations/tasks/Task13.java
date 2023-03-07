package HLK2.j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz




        Scanner sc =new Scanner(System.in);

        System.out.print("kelime giriniz ");
        String  str = sc.nextLine();


        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int karaktersayisi = str.replace(" ", "").length();
        System.out.println(karaktersayisi);


    }
}