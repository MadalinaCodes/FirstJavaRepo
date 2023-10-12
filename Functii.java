import java.util.Arrays;
import java.util.Collections;

public class Functii {
    // functie - logica delimitata care poate fi refolosita
    // nu putem folosi spatii in functii
    // nu putem defini o functie in alta functie (nu putem instala firefox in chrome)

    // o f simpla care ne printeaza ceva pe ecran
    // nu returneaza nimic, nu ne da niciun raspuns
    // nu are parametri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    //o f care saluta clientul in functie de numele lui
    // nu returneaza nimic, nu ne da niciun raspuns
    // are nevoie de parametri
    public static void printGreetingByName (String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    //o f care calculeaza media a 3 numere
    // ne returneaza ceva, ne da un raspuns
    // are nevoie de parametri
    // ce tip de date va avea raspunsul? (3 + 6)/2 = 4.5 (double)
    public static double mediaNr (double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    //o f care ne da valoarea lui pi
    // ne returneaza ceva, ne da un raspuns
    // raspunsul va fi double
    // are nevoie de parametri? nu

    public static double piValue() {
        // constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;

    }

    // TEMA
    // aria unui dreptunghi
    public static double arieDreptunghi (int lungime, int latime) {
        double arie = (lungime * latime);
        return arie;
    }

    // aria unui cerc
    public static double arieCerc(int Raza) {
        final double PI = 3.14;
        double arie = PI * (Raza * Raza);
        return arie;
    }

    // suma a 2 numere
    public static double sumaNr(double a, double b) {
        double suma = a + b;
        return suma;
    }

    // o f care returneaza cate caractere are numele + prenumele
    public static int caractereNume(@org.jetbrains.annotations.NotNull String nume, @org.jetbrains.annotations.NotNull String prenume) {
        int nrcaractere = nume.length() + prenume.length();
        return nrcaractere;
    }

    // avand 3 numere, returnati pe cel mai mare
    public static int celMaiMareNr(int a, int b, int c) {
        return Collections.max(Arrays.asList(a, b, c));
    }


    public static void main(String[] args) { // void = nimic
        // intra clientul
        printGreeting(); // se apeleaza functia

        // intra clientul nr 2
        printGreeting(); // daca dam CTRL + click pe functie ajung la corpul functiei

        // apela o f cu parametri (String nume, randul 16), oferind argumente (valorile parametrilor)
        printGreetingByName("Andon", "Madalina");
        printGreetingByName("Dragan", "Bogdan");
        printGreetingByName("Andon", "Catalin");

        System.out.println(mediaNr(3, 3, 4));
        double media1 = mediaNr(31213, 312313, 423);
        double media2 = mediaNr(35, 324, 41);
        double media3 = mediaNr(33, 11, 11);

        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(piValue()); // println = print line // aici o sa returneze 3.14

        System.out.println("TEMA");
        // tema: aria unui dreptunghi // merge
        System.out.println("arie dreptunghi: " + (arieDreptunghi(3, 2)));

        // aria cercului
        System.out.println("arie cerc: " + (arieCerc(6))); // DE CE NU POT PUNE R^2 IN FUNCTIE?

        // suma a 2 nr
        System.out.println("suma a doua numere: " + (sumaNr(20, 2)));

        // o f care returneaza cate caractere are numele + prenumele
        System.out.println("numar caractere nume + prenume: " + (caractereNume("Andon","Madalina")));

        // Hint de la Andy:
        String nume = "Mada";
        System.out.println("Hint " + (nume.length()));

        // identificati voi probleme de logica si vedeti cum le rezolvati

        // avand 3 numere, returnati pe cel mai mare
        System.out.println("Cel mai mare numar este: " + (celMaiMareNr(1, 2,3)));

    }
}
