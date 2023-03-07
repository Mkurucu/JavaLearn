package Mrt.j08_if;
import java.util.Scanner;
public class C08_Nestedoperator {
    public static void main(String[] args) {
/*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */



        Scanner sc = new Scanner(System.in);

        System.out.println("urun miktari gir bakam : ");
        int urunm = sc.nextInt();
        System.out.println("urun fiyati gir bakam : ");
        int urunF = sc.nextInt();

        double fature = urunm>100 ? (urunF*urunm*0.67) :(urunm*urunF);
        System.out.println("fatura bedili : "+fature);

    }
}
