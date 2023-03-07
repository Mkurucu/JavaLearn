package HLK1.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */
        Scanner sc = new Scanner (System.in);
        System.out.println( "3 sayi giriniz");

        double num1= sc.nextDouble();
        double num2= sc.nextDouble();
        double num3= sc.nextDouble();

        double num4 = num1*num2*num3;
        System.out.println( num4);



    }
}
