package osszefoglalo;

public class Ciklusok {
    public static void main(String[] args) {
        System.out.println("0-9:");
        /*int i = 0;
        System.out.print(i + " ");
        i++;
        System.out.print(i + " ");
        i++;
        System.out.print(i + " ");
        i++;*/

        /* while ciklus: ha NEM tudjuk, hányszor kell futnia */
        int szam = 10;
        while(szam <= 9){
            System.out.print(szam + " ");
            szam++;
        }
        System.out.println("");
        
        /* for ciklus: ha tudjuk, hányszor kell futnia  */
        for(int i = 10;i <= 9;i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        /* do/while: ha EGYSZER le kell futni a ciklusnak */
        szam = 10;
        do {
            System.out.print(szam + " ");
            szam++;
        } while (szam <= 9);
    }
}
