package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop'

        // initializam obiecte de tip ContBancar
        // sunt instante ale clase ContBancar
        ContBancar cont1 = new ContBancar("Madalina A", "RO001"); // aici ContBancar tine loc de String
        ContBancar cont2 = new ContBancar("Bogdan D", "RO002");

        // apelam metoda descriere
//        cont1.descriere();
//        cont2.descriere();

        // activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        // alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        // negative testing
        cont1.plataCard(500); // corect, nu se poate, tre sa am 300.5 => pass

        // positive cu suma exacta
        cont1.plataCard(300.50); // da, 0 => pass

        // positive de 2x
        cont2.plataCard(100);
        cont2.plataCard(200); // da, 700 => pass

        cont1.interogareSold();
        cont2.interogareSold();

    }
}
