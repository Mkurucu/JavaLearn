package Mrt.deneme;

import java.util.ArrayList;
import java.util.List;

public class array2 {

    public static void main(String[] args) {


    ///---> ArrayList Tanımlayalım <---\\\
    List<String> list = new ArrayList<>(7); //-> ArrayList'in başlangıç kapasitesini 7 Olarak Belirledik.
list.add("Mustafa Enes");
list.add("Oğuz");
list.add("Ömer Faruk");
list.add("Kemal");
list.add("Oğuz");

        System.out.println(list);



    ///---> Kopyalanacak Diziyi Tanımlayalım <---\\\
   Object [] array = new Object[5];
   array = list.toArray();
System.out.print("----------------------\n< Java ArrayList Kullanımı >\n----------------------\n-> ArrayList Elemanları: ");
for(int i=0;i<list.size();i++)
            System.out.print("["+list.get(i)+"] ");



System.out.print("\n----------------------\n-> toArray Kullanımı Sonucunda Oluşan Dizi: ");
for(int i=0;i<array.length;i++)
            System.out.print("["+array[i]+"] ");




System.out.println("\n----------------------\n-> lastIndexOf('Oğuz') Kullanımı: "
        +list.lastIndexOf("Oğuz")+"\n----------------------\n-> Contains('Ömer Faruk') Kullanımı: "+list.contains("Ömer Faruk")+"\n----------------------");


}}
