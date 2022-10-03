package Hlk.j10_StringManipulations;

public class C05_Start_EndWith {
    public static void main(String[] args) {
        String sehir ="istanbul";
        System.out.println( sehir.startsWith("i"));// i ile baslar mi true
        System.out.println( sehir.startsWith("ist"));// i ile baslar mi true
        System.out.println( sehir.startsWith("a",3) );// 3 ten sonraki a ile mi baslar
        System.out.println( sehir.startsWith("an",3) );// 3 ten sonraki a ile mi baslar
        System.out.println( sehir.startsWith("an",3) );// 3 ten sonraki a ile mi baslar

        System.out.println( sehir.endsWith("l"));// l ile biter mi true
        System.out.println( sehir.endsWith("ul"));// l ile biter mi true
    }
}
