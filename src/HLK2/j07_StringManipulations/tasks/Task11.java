package HLK2.j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
    /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı prnt eden code create ediniz
       */

        Scanner sc =new Scanner(System.in);

        System.out.print("adinizi  soyadiniz giriniz ");
        String  adsoyad = sc.nextLine();



        if (adsoyad.contains(" ")){
            System.out.println(adsoyad.substring(0, adsoyad.indexOf(' ')));
            System.out.println(adsoyad.substring( adsoyad.indexOf(' ')+1));

        }else{
            System.out.println("malesef adinizi soyadinizi sistem ayiramiyor. lutfen aralarina bir bosluk giriniz");
        }


    }
}
