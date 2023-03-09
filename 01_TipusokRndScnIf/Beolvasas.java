package osszefoglalo;

import java.util.Scanner;

public class Beolvasas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "latin2");//"iso-8859-2"
        
        //beolvasás:
        System.out.print("kor: ");
        int kor = sc.nextInt();//csak a szám kerül beolvasásra, enter ott marad a "konzolon"
        
        /*ha előbb szöveget olvasunk,akokr ez nem kell: */
        sc.nextLine();//a konzolon mradt enter kiolvasása
        
        System.out.print("kérem a neved: ");
        String nev = sc.nextLine();
        System.out.println("nev = " + nev);

        System.out.printf("%s kora %d év\n", nev, kor);
    }
}
