package HLK2.j07_StringManipulations.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
char karK1=harfDepo.charAt(harfDepo.indexOf("M"));
char karK2=harfDepo.charAt(harfDepo.indexOf("U"));
char karK3=harfDepo.charAt(harfDepo.indexOf("R"));
char karK4=harfDepo.charAt(harfDepo.indexOf("A"));
char karK5=harfDepo.charAt(harfDepo.indexOf("T"));

        System.out.println(karK1+karK2+karK3+karK4+karK5);//asciii 393
        System.out.println("adım : "+karK1+karK2+karK3+karK4+karK5);//string





    }
}
