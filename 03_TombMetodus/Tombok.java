package osszefoglalo;

public class Tombok {
    public static void main(String[] args) {
        //int kor1 = 7;
        //int kor2 = 12;
        
        int[] korok = {7, 12, 8};
        System.out.println("korok értéke: ");
        for (int i = 0; i < korok.length; i++) {
            System.out.print(korok[i] + " ");
        }
        System.out.println("");
        
        int[] ures = new int[3];
        System.out.println("üres tömb: ");
        for (int i = 0; i < ures.length; i++) {
            System.out.print(ures[i] + " ");
        }
        System.out.println("");
        ures[1] = 1;
        /* ArrayIndexOutOfBoundsException kivételeket kapunk:  */
        //ures[3] = 1;//érvényes indexek: 0,1,2
        //ures[-1] = 1;//érvényes indexek: 0,1,2
        
        ures = new int[4];
        ures[3] = 1;//érvényes indexek: 0,1,2,3
        
        int elsoElem = korok[0];
        int korokDb = korok.length;
        int utolsoElem = korok[korokDb - 1];
    }
}
