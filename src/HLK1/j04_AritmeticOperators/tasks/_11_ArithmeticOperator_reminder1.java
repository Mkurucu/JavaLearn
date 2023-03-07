package HLK1.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */
        Scanner sc=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1%num2;
        System.out.println("num3 = " + num3);
        



    }
}
