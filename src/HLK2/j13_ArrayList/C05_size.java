package HLK2.j13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        // size();-> listin eleman saysısını return eder (arr->length)
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println(listSehir.size());//4

    }
}