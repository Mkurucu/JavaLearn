package Mrt.j08_if;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ehliyetin varsa e yok h gir");
        char c = sc.next().charAt(0);
        if (c == 'E') {
            System.out.println("tecrubeniz kac yil");
            int tcrb=sc.nextInt();
            if (tcrb>=7){
                System.out.println("yaptiginiz km mesafesini giriniz: ");
                int km =sc.nextInt();
                if (km>=100000)
                    System.out.println("kontak anahtari senindir.");
                else System.out.println("once " +(100000-km) +"km tecrubeye ihtiyac var");
            }else System.out.println("once " +(7-tcrb) +"ihtiyac var");

    }




    }
}
