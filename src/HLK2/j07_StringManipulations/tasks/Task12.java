package HLK2.j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */



        Scanner sc =new Scanner(System.in);

        System.out.print("2 adinizi ve  soyadiniz giriniz ");
        String  adsoyadi = sc.nextLine();




        if (adsoyadi.contains(" ")){
            System.out.println(adsoyadi.substring( 0,1)
                            +"."+ adsoyadi.substring( adsoyadi.indexOf(' ')+1, adsoyadi.indexOf(' ')+2)
                            +"."+ adsoyadi.substring( adsoyadi.lastIndexOf(' ')+1, adsoyadi.lastIndexOf(' ')+2) +".");
        }else{
            System.out.println("iki ad bir soyad giriniz");
        }



    }
}

