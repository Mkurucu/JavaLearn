package Mrt.deneme;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        int sayi;
        sayi = 10;
        System.out.println(sayi);
        System.out.println(" sayi = " + sayi);

        double ddd = Double.MAX_VALUE;
        System.out.println("ddd = " + ddd);

        Scanner scanner = new Scanner(System.in);

        System.out.println("memleket gir " );
        String memleket=scanner.nextLine();
        System.out.println("memleket = " + memleket);

        System.out.println("sayi giriniz");
        int sayimiz=scanner.nextInt();
        System.out.println("sayimiz = " + sayimiz);

    }

}
//hocam once string sonra int yapinca oluyor. sanirim scanner ilk gordugu data alani ile sinirli kaliyor.