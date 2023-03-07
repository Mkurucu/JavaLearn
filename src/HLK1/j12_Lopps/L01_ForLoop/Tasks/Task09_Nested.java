package HLK1.j12_Lopps.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09_Nested {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */
        Scanner sc=new  Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int boyut=sc.nextInt();
        int t = 1;


        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.printf("%3d",t);//yanyana olması için ln kullanılmaz
            t=t+1;
            }
            System.out.println();//dumy
        }
    }
}
