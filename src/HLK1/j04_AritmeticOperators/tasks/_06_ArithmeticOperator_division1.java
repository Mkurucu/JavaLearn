package HLK1.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*     kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz.   */

        Scanner sc = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        System.out.println(num1/num2);

    }
}
