package sajatnev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class SajatNev {

    private static final Random rnd = new Random();
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        feladatokKonzolra();
        feladatokFajlba();
    }

    private static void feladatokKonzolra() {
        int[] tomb = feltolt(5);
        kiirKonzolra(stringbeVesszovel(tomb));
        kiirKonzolra("\n");
        
        boolean van13 = vanBenne13(tomb);
        kiirKonzolra("van benne 13: " + (van13 ? "van": "nincs"));
        kiirKonzolra("\n");
        
        int i = bekeres(tomb);//bekeres csak konzolon lesz
        kiirKonzolra("vizsgált szám: " + tomb[i]);
        kiirKonzolra("\n");
        
        kiirKonzolra(osztok(tomb, i));
        kiirKonzolra("\n");
    }

    private static void feladatokFajlba() throws IOException {
        int[] tomb = feltolt(5);
        String kimenet = stringbeVesszovel(tomb);
        kimenet += "\n";
        
        boolean van13 = vanBenne13(tomb);
        kimenet += "van benne 13: " + (van13 ? "van": "nincs");
        kimenet += "\n";
        
        int i = 2; /* bekeres(tomb);//bekeres csak konzolon lesz */
        kimenet += "vizsgált szám: " + tomb[i];
        kimenet += "\n";
        
        kimenet += osztok(tomb, i);
        kimenet += "\n";
        
        /* feladat csak fájlban: 12345689 osztói: */
        int szam = 12_345_689;
        kimenet += "vizsgált szám: " + szam;
        kimenet += "\n";
//        int[] t = {szam};
//        kimenet += osztok(t, 0);
        kimenet += osztok(szam);
        kimenet += "\n";
        
        kiirFajlba(kimenet);
    }
    
    private static int[] feltolt(int db) {
        int[] tomb = new int[db];
        for (int i = 0; i < db; i++) {
            tomb[i] = rnd.nextInt(15 - -5 + 1 ) + -5;
        }
        
        return tomb;
    }

    private static String stringbeVesszovel(int[] tomb) {
        String s = "üres a tömb!";
        if (tomb.length > 0) {
            s = tomb[0] + "";
            for (int i = 1; i < tomb.length; i++) {
                s += ", " + tomb[i];
            }
        }
        return s;
    }
    
    private static void kiirKonzolra(String str) {
        System.out.print(str);
    }
    
    private static void kiirFajlba(String fajlNeve, String tartalom) throws IOException {
        byte[] bytes = tartalom.getBytes();
        Path path = Paths.get(fajlNeve);
        Files.write(path, bytes);
    }
    
    private static void kiirFajlba(String tartalom) throws IOException {
        kiirFajlba("kimenet.txt", tartalom);
    }
    
    private static boolean vanBenne13(int[] tomb){
        int N = tomb.length;
        int i = 0;
        while(i < N && !(tomb[i] == 13)){
            i++;
        }
        return i < N;
    }
    
    private static int bekeres(int[] tomb){
        int h = tomb.length;
        int i = -1;
        boolean jo;
        do {
            String s = String.format("melyik index (0-%d): ", h-1);
            kiirKonzolra(s);
            i = sc.nextInt();
            jo = i >= 0 && i < h;
        } while (!jo);
        
        return i;
    }

    private static String osztok(int szam){
        szam = Math.abs(szam);
        String s = "|szám| osztói: ";
        boolean talaltOszto = false;
        for (int oszto = 2; oszto < szam; oszto++) {
            if (szam % oszto == 0) {
                if(!talaltOszto){
                    s += oszto;
                }else{
                    s += ", " + oszto;
                }
                talaltOszto = true;
            }
        }
        if (!talaltOszto) {
            s += "prím szám";
        }
        return s;
    }
    
    private static String osztok(int[] tomb, int index){
        if (tomb.length > 0) {
            int szam = tomb[index];
            return osztok(szam);
        }else {
            return "üres a tömb!";
        }
    }
}
