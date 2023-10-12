public class For {
    public static void main(String[] args) {
        // for - loop, str repetitiva
        // de unde incepem?
        // pana unde mergem?
        // pasul de parcurgere
        // problema: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++){ // i++ e acelasi lucru cu i=i+1
            // prima data i=1, apoi i=2 si tot asa
            System.out.println("Dalmatianul cu nr " + i);
        }

        //  ne ajuta sa parcurgem un array prin intermediul indexului
        int [] numere = {3, 7, 10, 20, 30}; // index 3 e 0, adica numere[0] = 3
        // for (int i = 0; i < numere.length; i=i+2) { // parcurgem din 2 in 2
        for (int i = 0; i < numere.length; i++) {
            System.out.println("elementul cu index " + i + " si valoarea " + numere[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere) {
            // ex: for { String culoare : culori, se citeste for string culoare din culori
            System.out.println("Numarul este " + numar);
// cu debug de fiecare data cand ajunge codul aici se pune o pauza astfel incat sa vedem care este starea aplicatiei in momentul de fata
        }

        // parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }

        // suma numerelor din array
        int s = 0; // suma care incepe de la 0
        for (int numar : numere) { // prima data cand intra e 3, a doua oara cand o sa intre suma s=3 ca am adaugat-o mai jos si numarul o sa fie 7
            s = s + numar;
            // traducere 0 = 0 + 3, apoi 3 = 3 + 7 si o sa ne dea un 10 pe care il tinem de acum inainte in suma, trecem prin array si actualizeaza suma adunand fiecare element din array {3, 7, 10, 20, 30} // asta e for EACH

        }
        System.out.println(s);
    }
}