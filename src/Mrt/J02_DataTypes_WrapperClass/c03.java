package Mrt.J02_DataTypes_WrapperClass;

public class c03 {
    public static void main(String[] args) {
        String ad="Haluk";
        String soyad="Bilgin";

        int a=7;
        int b=11;
        System.out.println(a+b);

        System.out.println(ad+soyad+a+b);//HalukBilgin711

        System.out.println(a+ad+soyad+b);//7HalukBilgin11

        System.out.println(a+b+ad+soyad);//18HalukBilgin

        System.out.println(" "+a+b);//711

        System.out.println(ad+soyad+(a+b));//HalukBilgin18

        System.out.println((a+b)+ad+soyad);//18HalukBilgin

        System.out.println(ad+(a-b)+(a-b));//Haluk-4-4

        System.out.println(ad+((a-b)+(a-b)));//Haluk-8

        char ch='1';//
        System.out.println(ad+ch);//Haluk1

        System.out.println(a+ch+ad); //56Haluk //toplamada string haric herseyi toplar

        System.out.println(ad+(ch+b));//Haluk60

        System.out.println(a+ad+ch);//7Haluk1


    }
}
