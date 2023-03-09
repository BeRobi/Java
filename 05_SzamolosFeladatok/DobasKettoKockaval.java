package tombbel;

import java.util.Random;

public class DobasKettoKockaval {

    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        /* 1 lehetséges kimenet 5 dobá esetén */
//        System.out.println(" 5 ****** (2 db)");
//        System.out.println("11 *** (1 db)");
//        System.out.println("12 ****** (2 db)");
        
        int[] dobasok = kettoKockavalDob(5);
        statisztika(dobasok);
    }

    private static int[] kettoKockavalDob(int db) {
        int[] dobasok = new int[13];
        for (int i = 0; i < db; i++) {
            int dobas = rnd.nextInt(2,13);
            dobasok[dobas]++; //dobasok[dobas] = dobasok[dobas] + 1;
        }
        return dobasok;

    }

    private static void statisztika(int[] adatok) {
        int maxElofordulas = maximumKivalasztas(adatok);
        for (int i = 0; i < adatok.length; i++) {
            if (adatok[i] != 0) {
                System.out.printf("%2d ", i); //index
                double arany = (double)adatok[i] / maxElofordulas;
                egysor(arany);
                System.out.printf(" (%d db)\n", adatok[i]);
            }
        }
    }

    private static int maximumKivalasztas(int[] adatok) {
        int maxIndex = 0;
        for (int i = 0; i < adatok.length; i++) {
            if(adatok[i] > adatok[maxIndex]){
                maxIndex = i;
            }
        }
        return adatok[maxIndex];
    }

    private static void egysor(double arany) {
        int MAX_CSILLAG = 40;
        //int db = MAX_CSILLAG * arany;
        for (int i = 0; i < MAX_CSILLAG * arany; i++) {
            System.out.print("*");
        }
        //System.out.println("");
    }
    
}
