package Mrt.deneme;

import java.util.Scanner;

public class aa2 {
    public static void main(String[] args) {

        Scanner Scan =new Scanner(System.in);
        System.out.println("sayi giriniz");
        int a = Scan.nextInt();
    String sonuc =     a>0      ?  "Pozitif"    :   ( a==0      ?  "0"        :   "negatif"  );
        System.out.println(sonuc);
}
}