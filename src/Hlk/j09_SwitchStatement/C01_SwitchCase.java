package Hlk.j09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */



        //
        //kullanicinin girdigi rakami yazi ile print eden code create ediniz.
//IF ELSE ILE
        Scanner sc = new Scanner(System.in);

        System.out.println("sayi gir bakam : ");
        int rakam = sc.nextInt();
        if (rakam == 0)
            System.out.println("girilenrakam  sifir");
        else if (rakam == 1)
        {System.out.println("girilenrakam  bir");
        }else if (rakam == 2)
        {System.out.println("girilenrakam  iki");
        }else if (rakam == 3)
        {System.out.println("girilenrakam  uc");
        }else if (rakam == 4)
        {System.out.println("girilenrakam  dort");
        }else if (rakam == 5)
        {System.out.println("girilenrakam  bes");
        }else if (rakam == 6)
        {System.out.println("girilenrakam  alti");
        }else if (rakam == 7)
        {System.out.println("girilenrakam  yedi");
        }else if (rakam == 8)
        {System.out.println("girilenrakam  sekiz");
        }else if (rakam == 9)
        {System.out.println("girilenrakam  dokuz");
        }else
        {System.out.println("hatali giris lutfen rakam girin");
        }

        switch (rakam){
            case 0:
                System.out.println("girilenrakam c  sifir");
                break;
            case 1:
                System.out.println("girilenrakam c  bir");
                break;
            case 2:
                System.out.println("girilenrakam c  iki ");
                break;
            case 3:
                System.out.println("girilenrakam c  uc ");
                break;
            case 4:
                System.out.println("girilenrakam c  dort ");
                break;
            case 5:
                System.out.println("girilenrakam  c bes ");
                break;
            case 6:
                System.out.println("girilenrakam  c alti ");
                break;
            case 7:
                System.out.println("girilenrakam  c yedi ");
                break;
            case 8:
                System.out.println("girilenrakam  c sekiz ");
                break;
            case 9:
                System.out.println("girilenrakam  c dokuz ");
            default:
                    System.out.println("hatali giris lutfen rakam girin");
        }


    }
}
