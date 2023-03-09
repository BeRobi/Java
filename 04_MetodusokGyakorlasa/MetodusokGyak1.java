package gyakorlok;

public class MetodusokGyak1 {
    public static void main(String[] args) {
        /* csak 1 metódus legyen a main-ben! */
        feladatok();
        
        System.out.println("\u001B[45m" + " ");
    }

    private static void feladatok(){
        f1_Elso10SzamOsszegeKiirva();
        f2_KettoSzamOsszegeKiirva();
        f3_NegySzamOsszegeKiirva();
        f4_HaromSzamOsszegeGyokeKiirva();
    }

    private static void f1_Elso10SzamOsszegeKiirva() {
        int osszeg = elso10SzamOsszege();
        String kimenet = "Az első 10 szám összege: " + osszeg + "\n";
        kiirKonzolra(kimenet);
    }
    
    private static void f2_KettoSzamOsszegeKiirva() {
        int szam1 = 7, szam2 = 4;
        int osszeg = osszead(szam1, szam2);
        kiirKonzolra("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
    }
    
    private static void f3_NegySzamOsszegeKiirva() {
        int osszeg = osszead(1, 2);
        osszeg = osszead(osszeg, 3);
        osszeg = osszead(osszeg, 4);
        kiirKonzolra("1+2+3+4="+osszeg+"\n");
        //vagy:
        osszeg = osszead(1, 2);
        osszeg += osszead(3, 4);
        kiirKonzolra("1+2+3+4="+osszeg+"\n");
    }
    
    private static void f4_HaromSzamOsszegeGyokeKiirva() {
        int a = 3, b = 4, c = 2;
        int osszeg = osszead(a, b);
        osszeg = osszead(osszeg, c);
        String s = "%d+%d+%d gyöke:".formatted(a,b,c);
        double gyok = Math.sqrt(osszeg);
        String kimenet = String.format("%s %.4f\n", s, gyok);
        kiirKonzolra(kimenet);
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int osszead(int a, int b){
        return a+b;
    } 

    private static void kiirKonzolra(String szoveg) {
        System.out.print(szoveg);
    }
}
