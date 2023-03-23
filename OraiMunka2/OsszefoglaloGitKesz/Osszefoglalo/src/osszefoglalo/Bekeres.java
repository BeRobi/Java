package osszefoglalo;

import java.util.Scanner;

public class Bekeres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin2");//"iso-8859-2"
        
        System.out.print("kor: ");
        int kor = sc.nextInt();

        //a szám utáni \n beolvasása:
        sc.nextLine();//ha előbb számot kérünk be, majd utána szöveget, akkor kell
        
        System.out.print("mi a neved: ");
        //beolvasom a választ:
        String nev = sc.nextLine();
        System.out.println("nev = " + nev);

        System.out.printf("%s kora %d\n", nev, kor);  
    }
}
