import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Flow control - if else
        //evalueaza conditii si bifurca codul in functie de rezultat
        System.out.println("pornim radio");
        boolean piesa_faina = false; // invat calculatorul daca piesa e faina sau nu
        // daca piesa e frumoasa, dau mai tare
        if (piesa_faina == true) {
            System.out.println("dau mai tare radioul");
            System.out.println("incep sa fredonez piesa");
        }
        System.out.println("oprim radio");

        // if else
        int nr = 4;
        if (nr % 2 == 0) {
            System.out.println("numarul este par");
        } else {
            System.out.println("numarul este impar");
        }

        // este un numar pozitiv?
        if (nr > 0) {
            System.out.println("nr pozitiv");
        } else {
            System.out.println("nr negativ");
        }

        // luam date de la tastatura

//        Scanner sc = new Scanner(System.in); // Scanner ne ajuta sa luam date de la tastatura
//        System.out.println("Introdu ora");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora invalida");
//        } else if (ora <= 11) {
//            System.out.println("buna dimineata");
//        } else if (ora <= 18) {
//            System.out.println("buna ziua");
//        } else if (ora <= 21) {
//            System.out.println("buna seara");
//        } else if (ora <= 24) {
//            System.out.println("noapte buna");
//        } else if (ora > 24){
//            System.out.println("ora invalida");
//        }
// CTRL + / pentru blockul de mai sus

        // tema - contorizati viteza unei masini: <0 viteza invalida, ==0 stationeaza, <=50 localitate, <=90 drum judetean, >90 autostrada (asta ar fi else-ul)
       // Scanner sc = new Scanner(System.in); randul asta l-am pus comentariu pentru ca era deja scris mai sus si imi dadea eroare sa il pun de 2 ori

//        System.out.println("Introdu viteza");
//        int viteza = sc.nextInt();
//        if (viteza < 0) {
//            System.out.println("viteza invalida");
//        } else if (viteza == 0) {
//                System.out.println("stationeaza");
//        } else if (viteza <= 50) {
//            System.out.println("localitate");
//        } else if (viteza <= 90) {
//            System.out.println("drum judetean");
//        } else if (viteza > 90) {
//            System.out.println("autostrada");
//        }
// CTRL + / pentru blockul de mai sus

        // flow control - tine de directionarea codului in functie de o conditie
        // switch - se foloseste cand stim valorile posibile
        Scanner sc = new Scanner(System.in);
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default:
                System.out.println("optiune invalida");
        }

        // tema - alegeti piesele dintr-un cd, 5 piese, spunem pentru fiecare cum se numeste, piesa 1 - Adi Minune - Asa sunt zilele mele, piesa 2 - De ce ma minti, de ce ma minti, piesa 3 - Indianca mea, araboaiaca mea, piesa 4 - Buzele tale, piesa 5 - Hai in vacante
//        int optiunea = sc.nextInt();
//        switch (optiunea) {
//            case 0:
//                System.out.println("meniu anterior");
//                break;
//            case 1:
//                System.out.println("piesa 1 - Adi Minune - Asa sunt zilele mele");
//                break;
//            case 2:
//                System.out.println("piesa 2 - De ce ma minti, de ce ma minti");
//                break;
//            case 3:
//                System.out.println("piesa 3 - Indianca mea, araboaiaca mea");
//                break;
//            case 4:
//                System.out.println("piesa 4 - Buzele tale");
//                break;
//            case 5:
//                System.out.println("piesa 5 - Hai in vacante");
//                break;
//            default:
//                System.out.println("optiune invalida");
//        }
// CTRL + / pentru blockul cu tema de mai sus


    } // inchide functia main
} // inchide clasa
