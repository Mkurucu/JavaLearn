package Hlk.j11_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {


        System.out.println("1. sira");

    topla() ;
        System.out.println("3. sira topla metodu bitisi");

    topla2(34,43);

        System.out.println("5. sira topla2 bitisi ");
    }// main matiod bitisi


    public static void topla() {
    int a=33;
    int b=23;
        System.out.println(a+b);
        System.out.println("2. sira topla");

    }
    public static void topla2 (int a,int b) {
        System.out.println("4. sira topla2");
        System.out.println(a + b);

    }

} //class bitisi
//Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
//Method parantezinin icinde olusturulan variable'lara "parametre" denir.
//Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
//Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli
// bir method Class'in icinde ama  main method'un disinda  cereate edilir
// Best practice-> method'lar main method'dan sonra create edilir.