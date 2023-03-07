package Ellly.lesson02;

import java.util.Scanner;

public class Q11_SwitchCase {
    /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)


*/
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("gun giriniz");
        String gun = scan.nextLine();


        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("Java dersi gunleri");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println(" SQL dersi gunleri");
                break;
            case "Pazar":
                System.out.println(" izin gunu");
                break;




        }

}}