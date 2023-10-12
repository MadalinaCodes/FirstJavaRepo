public class Array {
    public static void main(String[] args) {
    // declarare si initializare
    //      index        0          1        2      3      4      5
    String [] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada", "Mari" };
    int [] numere = {1, 33, 81, 99, 201};

    // contine mai multe elemente de acelasi tip
    // accesam elementele prin index, care incepe de la 0
    // are o dimensiune fixa, nu vom mai putea adauga alte elemente pentru ca array-ului acesta i s-a alocat deja o zona de memorie si anume 1 (gigel), 2 (costel), 3 (mari), 4 (ela), 5 (ada), lentgth-ul (sau size in python) acestui array este 5, niciodata nu vom putea pune 6 elevi la ore, va trebui sa stim tot timpul cata memorie sa alocam array-urilor, putem sa alocam mai multa memorie la inceput si sa folosim o parte din ea sau putem sa folosim niste liste pt ca deasupra la array vine o lista care poate avea orice dimensiune si putem adauga sau scoate elemente din ea
    // are proprietatea length care ne da dimensiunea array-ului

    // accesam elementele din index care incepe de la 0
        System.out.println(elevi[2]);
        elevi[2] = "Sebi"; // o dam afara pe Mari si il bagam pe Sebi // suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length); // =>5

        // putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]); // "Gigel" + "Costel"
        System.out.println(elevi.length + 5); // +> 5+5=10

        // sa printam tot timpul ultimul element indiferent de marime
        System.out.println("Last place: " + elevi[elevi.length - 1]);

        // declarare si alocare de memorie
        int [] note = new int [5]; //aici sunt 5 note in spate si ele vor fi 0, 0, 0, 0, 0 pt ca un int are valoare default 0// facem un array de note si alocam o dimensiune de 5, dar noi nu stim inca care o sa fie dimensiunea
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;


    }


}
