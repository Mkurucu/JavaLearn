package Mrt.J07_Logical_MantiksalOperator;

public class C01_MantiksalOperator {
    public static void main(String[] args) {
        boolean b1=true;
        int a=3;
        int c=7;

        System.out.println( b1&(a<c));
        System.out.println( b1&(a>c));

        System.out.println(b1&(a==c));

        //or->veya
        System.out.println(b1||(a<c)); //true

        System.out.println(b1||(a>c)); //true

        System.out.println(b1||(a==c));//true
        // not->!

        System.out.println(!(b1||(a>c)));// false



    }
}
