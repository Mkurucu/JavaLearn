package Hlk.j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {



        String sehir ="istanbul";
        char besincikarakter = sehir.charAt(5);
        System.out.println( besincikarakter);
        System.out.println(sehir.charAt(sehir.length()-1) );// son karakter
        System.out.println(sehir.charAt(0) );// ilk karakter
        System.out.println(sehir.charAt(sehir.length()-1)/2 );


        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri print eden code create ediniz...
        Scanner sc =new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= sc.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");
    }

}
