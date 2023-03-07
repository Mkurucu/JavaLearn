package HLK1.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */
        Scanner sc =new Scanner(System.in);
        System.out.println("4 tane sayi giriniz");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = num1 * num2   * num3 * num4 ;
        System.out.println("num5 = " + num5);



    }
}
