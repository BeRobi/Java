package gyakorlok;

public class MetodusokGyak3 {
    
    /* 
     * fel nem használ, másfajta megközelítési mód: 
     * SZERZŐ: Péti Dominik
    */
    private static final String ALAP_SZIN = "\u001B[0m";
    private static final String SAROK_NEGYZET_SZIN = "\u001B[44m";
    
    private static final String[] NEGYZET = {
        "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN),
        "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, ALAP_SZIN, ALAP_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN),
        "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN),
        "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, ALAP_SZIN, ALAP_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN),
        "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN)
    };
    /* fel nem használt rész vége */
    
    public static void main(String[] args) {
        grGenerator();
    }

    private static void grGenerator() {
        konzolraKiir(qr());
        konzolraKiir(qr(20));
        konzolraKiir(qr(true));
        konzolraKiir(qr(20, true));
    }
    
    private static String qr(){
        return qr(10, false);
    }
    
    private static String qr(int hossz){
        return qr(hossz, false);
    }
    
    private static String qr(boolean negyzet){
        return qr(10, negyzet);
    }
    
    private static String qr(int hossz, boolean negyzet){
        int db = negyzet ? hossz - 5 : hossz;
        String s = "";
        for (int i = 0; i < hossz/2; i++) {
            s += randomBitSor(db);
            if(i < 5 && negyzet){
                s += negyzethez(i);
            }else if(i >= 5 && negyzet){
                s += randomBitSor(db-5*2);
            }
            s += "\n";
        }
        
        return s;
    }
    
    private static String randomBitSor(int db){
        String s = "";
        for (int i = 0; i < db; i++) {
            s += szin() + " ";
        }
        return s;
    }
    
    private static String szin() {
        return Math.random() > .5 ? "\u001B[43m" : "\u001B[40m";
    }
    
    /* másfajta megközelítést ld. legfelelül */
    static String negyzethez(int i){
        String sor = "";
        String szin = "\u001B[42m";
        String feher = "\u001B[40m";
        String s = szin+" ";
        String f = feher+" ";
        switch(i){
            case 0: 
                sor = szin+"     ";
                break;
            case 1:
                sor = s + f + f + f + s;
                break;
            case 2:
                sor = s + f + s + f + s;
                break;
            case 3:
                sor = s + f + f + f + s;
                break;
            case 4:
                sor = szin+"     ";
                break;
        }
        
        return sor;
    }
    
    private static void konzolraKiir(String str){
        System.out.println(str);
    }
}
