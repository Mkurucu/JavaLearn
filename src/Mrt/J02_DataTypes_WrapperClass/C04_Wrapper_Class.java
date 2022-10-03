package Mrt.J02_DataTypes_WrapperClass;

public class C04_Wrapper_Class {
    public static void main(String[] args) {
        String name = "hAluK";
        int yas=33;
        System.out.println(name.toLowerCase());// hepsini kucuk yapar
        System.out.println(name.toUpperCase());// hepsini Buyuk yapar


        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.
        String tc= "12345";
        System.out.println(tc);
        String id= "9876";

        int yenitc=Integer.valueOf(tc); //stringi int cevirir
        System.out.println(yenitc);
        int yeniid=Integer.valueOf(id);
        System.out.println(yeniid);

        System.out.println(yeniid+yenitc);

        String okulno ="2345A";
        //int yeniokulno=Integer.valueOf(okulno); //  cevirmez hata verir
        //System.out.println(yeniokulno);


        System.out.println("maksimum minimum degerler");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("deneme");

        int aaa= Integer.MAX_VALUE;
        System.out.println(aaa+1);

    }
}
