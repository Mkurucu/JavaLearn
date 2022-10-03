package Hlk.j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {

/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str = ("Good");
        System.out.println("ilk gorulen o nun yeri index nosu: " + str.indexOf("o"));
        System.out.println("ilk gorulen d nun yeri index nosu: " + str.indexOf("d"));
        System.out.println("ilk gorulen D nun yeri index nosu: " + str.indexOf("D"));// olmayan karakter -1 gelir

        System.out.println("ilk gorulen D nun yeri index nosu: " + str.indexOf("od"));// 2


        System.out.println("son gorulen D nun yeri index nosu: " + str.lastIndexOf("d"));// 3



        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */


        // Scanner sc=new Scanner(System.in);
        //System.out.print("cumle giriniz : " );

        //String kelime=sc.next();

        //System.out.println("sonuc: "+ kelime.index);// 3

        String isim = ("java nerede javacan oradadir.");
        // System.out.println( isim.indexOf("java",2));
        if  (isim.indexOf("java") != -1) {
            System.out.println("en az bir tane");

        } if (isim.indexOf("java", 2) != -1) {
            System.out.println("en az iki tane");
        } else System.out.println("yok");

    }
}
//hocam bunun icin neden olmaz dediniz ben anlamadim. dersi bolmemekk icin sona sakladiim.
