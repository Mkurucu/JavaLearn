package HLK1.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner sc=new Scanner(System.in);
        System.out.println("4 sayi giriniz");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = num1 * num2 * num3 * num4 ;
        System.out.println(num5);





    }
}
