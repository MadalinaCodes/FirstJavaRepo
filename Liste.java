import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; //am pus randul asta manual, dar putea fi pus automat apasand Alt + Enter pe List si arrayList de pe randul 7

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>(); // Alt + Enter pe List si arrayList pentru importul unor liste => apare randul 2
        // listele au o dimensiune dinamica

        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elementele?
        System.out.println(fructe.get(0));

        // cum se afla indexul unui element?
        System.out.println("Index banana " + fructe.indexOf("banana"));

        // este lista goala?
        System.out.println(fructe.isEmpty());

        // eliminam toate elementele din lista
        // fructe.clear();

        //scoatem un element
        fructe.remove("mar");

        // aflam dimensiunea listei
        System.out.println(fructe.size());

        // listam elementele
        //System.out.println(Arrays.toString(fructe.toArray())); // varianta complexa
        System.out.println(fructe); // varianta simpla

        if (!fructe.isEmpty()) { // daca NU este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        // declaram o lista imutabila si o initializam cu valori// din lista aceasta nu putem sterge sau adauga elemente
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        // System.out.println(Arrays.toString(numere.toArray())); // printam ce se intampla in spate, adica din clasa Arrays se face toString, adica array se interpreteaza ca un sir de caractere si numere fiindca e o lista cumva, se transforma intr-un array
        System.out.println(numere); // varianta simpla

        // declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"}; // 1. pornim de la un array
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers)); // 2. il transformama intr-o lista si ne declaram o variabila noua flowerList care sa parcurga florile si sa le transforme intr-o lista
        flowerList.add("Rose"); // 3. pe noua lista adaugam sau sa stergem
        //System.out.println(Arrays.toString(flowerList.toArray())); // varianta complexa
        System.out.println(flowerList); // varianta simpla

        // aflam unde este Poppy
        int poppy_index = flowerList.indexOf("Poppy");
        // stergem ce este in acea pozitie
        flowerList.remove(poppy_index);

        // scoatem in functie de valoare
        flowerList.remove("Catmint");

        // System.out.println(Arrays.toString(flowerList.toArray())); // varianta complexa
        System.out.println(flowerList); // varianta simpla
    }
}
