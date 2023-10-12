public class While {
    public static void main(String[] args) {
        // while - loop
        // o zona de cod care se repeta atata timp cat o conditie e true

        // problema: masina merge cat timp are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0){ // cand ajunge la 0, supapa s-a inchis => false, deci nu vom mai intra in while
            // acceleram
            System.out.println("Vruum, Vruum");
            // scadem benzina
            litri_benzina = litri_benzina-1;
            // aprindem beculettul cand avem <=3 litri
            if (litri_benzina<=3) {
                System.out.println("Se aprinde becul rosu");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
