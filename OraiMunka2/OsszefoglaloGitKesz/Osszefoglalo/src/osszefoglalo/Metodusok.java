package osszefoglalo;

public class Metodusok {
    /* 
      - átláthatób lesz a kód
      - elkerüljük a kódduplikálást
      * 1 metódusnak 1 feladata legyen
      * a metódusnak ne legyen mellékhatása
    */
    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        int osszeg = elso10SzamOsszege();
        String s = String.format("az első 10 szám összege: %d", osszeg );
        kiir(s+"\n");
        
        int a = 3, b = 6;
        osszeg = kettoSzamOsszege(a, b);
        s = String.format("%d + %d = %d\n", a, b, a + b);
        kiir(s);
    }
    
    private static int elso10SzamOsszege() {
        //összegzés tétele adatszerkezet nélkül
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
        //System.out.printf("az első 10 szám összege: %d\n", osszeg );
    }

    private static int kettoSzamOsszege(int a, int b) {
        return a + b;
        //System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    private static void kiir(String str){
        System.out.print(str);
    }
}
