package Mrt.deneme;

public class aa {
    public static void main(String[] args) {

        int abdiYas=33;  //int data type'da abdi yas adinda degeri 33olan veriable create edildi.
        int mstfYas=41;
        if (abdiYas==mstfYas) {  //abdi yas ile mustyas esitligi kontrol edilir
            System.out.println("yasdas arkadaslar ");
            System.out.println("yoksam siz gardes misiniz?");}
        if (mstfYas>=40){
            System.out.println("mista bey 40 yas dirt yas");}
        if (abdiYas+mstfYas>100) {
            // if blokk'da {} kullanilmazsa (bad practice)ilk ; kadar komut if ile calisir sonrasi ifden bagimsiz run olur.
            System.out.println("bir asirlik yas ");
            System.out.println("agam devamke code sorunsuz run oldu");
        }
    }
    //bagimsiz if bloklari sadece kendi scope(kapsam)i run eder.birden fazla if blok hepsinin body calisabilecegi gbi sart saglanmazsa hic biri de calismayabilir.


} //main sonu
//class sonu


