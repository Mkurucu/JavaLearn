package HLK2.j08_Lopps.L01_ForLoop.Tasks;

public class Task06_Nested {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.



        for (int i = 1; i <=10 ; i++) {
            for (int a = 1; a<=10;a++){


                System.out.println(i+" x "+a+" = "+(i*a));
            }
            System.out.println();
        }

    }
}
