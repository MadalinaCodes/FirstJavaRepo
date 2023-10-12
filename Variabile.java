public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volkswagen";
        String modelMasina = "Golf 5 plus";
        // strongly typed - trebuie sa specificam tipul de date al variabilelor/uneltelor cu care lucram

        System.out.println("Am cumparat o masina marca:" + marcaMasina);
        System.out.println("Este modelul:" + modelMasina);

        //suprascriere
        modelMasina = "Golf 6";

        System.out.println("Am cumparat o masina marca:" + marcaMasina);
        System.out.println("Este modelul:" + modelMasina);

        //declarare
        String nume;
        String prenume;

        //initializare

        prenume = "Madalina";
        nume = "Andon";

        int varsta = 27;

        // concatenare de stringuri
        System.out.println(prenume +" "+ nume + " cu varsta de " + varsta);


    }

}
