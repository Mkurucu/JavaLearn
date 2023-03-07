package HLK2.j07_StringManipulations.tasks;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */




        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();


        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        String result = isim.length() == 3 ?
                ((c1 != c2 & c1 != c3 && c2 != c3) ? "Girdiginiz isim 3 harfli ve unique karakterle sahip"
                : "Girdiginiz isim 3 harfli ancak unique karakterle sahip degil ")

                : "Girdiginiz isim 3 harfli değil";

        System.out.println(result);
        System.out.println(c1);

    }
}