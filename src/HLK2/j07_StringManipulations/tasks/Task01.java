package HLK2.j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); //
        String text = scan.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true



        boolean boslukVarMi2 = text.isBlank();
        System.out.println("boslukVarMi = " + boslukVarMi2); //boslukVarMi = true
        boolean boslukVarMi3 = text.isEmpty();
        System.out.println("boslukVarMi = " + boslukVarMi3); //boslukVarMi = true

    }
}

