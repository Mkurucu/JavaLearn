package HLK2.j07_StringManipulations.tasks;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Alamanya";

       // str.indexOf('a') ilk a'nın indexi
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

    }
}
