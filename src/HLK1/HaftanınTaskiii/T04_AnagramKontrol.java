package HLK1.HaftanınTaskiii;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

    public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Anagram icin 1. degeri giriniz : ");
        String str1 = scan.nextLine().toLowerCase().replace(" ", "");
        System.out.print("Lutfen Anagram icin 2. degeri giriniz : ");
        String str2 = scan.nextLine().toLowerCase().replace(" ", "");

        System.out.println(isAnagram(str1, str2));

    }

    public static boolean isAnagram(String str1, String str2) {

        //boolean isAnagram =false;
        char[] arr1 = str1.replace(" ", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);

        if (str1.length() != str2.length()) {
            return false;

        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;


    }

}
