/*
Recap:
variabile
tipuri de date: char, string,int, float/double, boolean

Operatori:
aritmetici: +, *, /, % (modulo - aflarea restului impartirii)
de comparare: < >, ==, !=, >=, <=
logici: && (and), || (or)

Flow control - if else
evalueaza conditii si bifurca codul in functie de rezultat
 */

public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; // suprascriere
        // System.out.println(a != b); //5 diferit de 5? => false
        System.out.println(a == b); //5 egal cu 5? => true
        System.out.println(7>b && 8>b); // 7>5 SI 8>5?
        System.out.println(7>b || 3>b); // true && true
        System.out.println(7>b && (2>b || 3>b)); // true && false => false
        System.out.println(7>b || (2>b || 3>b)); // true || false => true
        System.out.println(!(7>b)); // !true => false


    }
}
