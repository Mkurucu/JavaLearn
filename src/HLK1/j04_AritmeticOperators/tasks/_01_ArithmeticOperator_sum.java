package HLK1.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

        Scanner sc =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num1 = sc.nextInt();
        System.out.println("bir sayi daha giriniz");
        int num2 = sc.nextInt();

        System.out.println(num1+num2);




    }
}
