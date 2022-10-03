package Mrt.j01_Variables;                                     //1 package

public class HelloWorld1 {                                    //2 class


    public static void main(String[] args) {                     // 3 main
        System.out.println("Merhaba Dünya");//bu komut konsala yazilan metni print eder
        System.out.println("selemlar");
        System.out.println("selemlar");
        System.out.println("selemlar");
        System.out.println("selemlar");//ctrl d ile satir kopyalanir


        /*Ekrana yazdırma işlemlerinde System.out.print() - System.out.println() -
System.out.printf() metotları kullanılmaktadır*/
        /*  coklu satır yorum */


/*
TRICK : javada code satırı cümle(statement) sonuna mutlaka  ; koyulmalı
code satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
CTE düzeltimeden code yazılmaz yazılan code çalışmaz
 */


        System.out.print("Murat kürücü");
        System.out.println("33");
        System.out.println("erzurum");
        System.out.println("issiz");

        /*
TRICK :
    System.out.print(); -> Bu metot parametre olarak gelen ifadeleri ekrana yazdırır.
    Örneğin ekrana "Garry" ifadesini yazdı. Ardından yine bir yazdırma işlemi yaptınız
    ve "Tom" ifadesini yazdırdınız. İşte o zaman ekrana "GarryTom" yazacaktır.
System.out.println(); -> Kendisinden sonraki gelen ifadeleri alt satırda devam ettirir.
javada space "boşluk" bir character olarak tanımlanır
        h a l u k->9 karakter
 */


    }


}
