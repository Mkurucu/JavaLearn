package Mrt.j03_ScannerClass_TypeCasting;


import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //kullanicidan data almak icin su 3 adim takip edilir

        // 1. adim => svanner classdan obje talep edilir.

        //Scanner scan = new Scanner(System.in); // cokomelli
        // Scanner clasindan scan isimde degerini system icinden alan bir obje


        // 2. adim => kullanicidan istenen veri icin bildirimde bulunur.
        //System.out.println("adinizi girin");


        // 3. adim => kullanicinin girdisi
        //String isim=scan.nextLine(); // kullanicidan gelen string tipinde  isim verisi objesini nextline metodu ile atandi.
       // System.out.println("isim = "+isim);



        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.
      // Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.
/*
        // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        System.out.println("adınızı giriniz :");

        // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı
        System.out.println("isim = " + isim);


        //
        System.out.println("Karenin kenarı giriniz: ");
        int k= scan.nextInt();
        System.out.println("alan = " + k*k);
        System.out.println("cevre= " + 4*k);
        System.out.println("Dikdörtgenin kısa kenarını giriniz: ");
        int kk=scan.nextInt();
        System.out.println("Dikdörtgenin uzun kenarını giriniz: ");
        int uk=scan.nextInt();
        System.out.println("dalan = "+ kk*uk );
        System.out.println("dalan = "+ 2*(kk+uk) );

        //

        //Scanner scan = new Scanner(System.in);
        System.out.print("Günlük içtiğiniz çay sayısını giriniz:");
        int caySayisi= scan.nextInt();
        System.out.print("Şeker sayısını giriniz:");
        int sekerSayisi= scan.nextInt();
        System.out.print("Yıllık şeker tüketiminiz :"+ (caySayisi*sekerSayisi*1.7*365)/1000+ "kg şeker tüketiyorsunuz");

 */


        Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminiz giriniz : ");//2. adım
        //char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
       // System.out.println("isminizin ilk karakteri :" + ch);
        String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        System.out.println("isim = " + isim);
















    }
}
