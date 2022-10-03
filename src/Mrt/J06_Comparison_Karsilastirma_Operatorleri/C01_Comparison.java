package Mrt.J06_Comparison_Karsilastirma_Operatorleri;

public class C01_Comparison {
    public static void main(String[] args) {

        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */
        int slmyas =33;
        int Krmyas =41;
        System.out.println("Krmyas slmyas esit mi " +( Krmyas==slmyas));
        System.out.println("Krmyas slmyas esit degil mi " +( Krmyas!=slmyas));
        System.out.println("Krmyas slmyas den kucukmu " +( Krmyas<slmyas));
        System.out.println("Krmyas slmyas den  buyuk mu " +( Krmyas>slmyas));

        String name="mrt";
        String name1="mrt";

        System.out.println(name1==name);


    }
}
