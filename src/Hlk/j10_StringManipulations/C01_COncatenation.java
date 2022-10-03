package Hlk.j10_StringManipulations;

public class C01_COncatenation {
    public static void main(String[] args) {
        /**
         * concat() metodu icine (parametre ) aldigi veriable yi calistirdigi stringin sonuna ekler 
         * javada + islemi yapilirken eger en az string variable varsa java toplama degil concat yapar.

         */
        
        String name = "NUR";
        String meslek = " QA tester ";
        System.out.println(name.concat(meslek));
        System.out.println(name);
        name =meslek.concat(name);
        System.out.println(name);
        System.out.println("name =" +name);


    }
}
