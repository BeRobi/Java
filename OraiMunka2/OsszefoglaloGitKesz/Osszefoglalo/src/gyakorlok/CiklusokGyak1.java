package gyakorlok;

public class CiklusokGyak1 {
    public static void main(String[] args) {
        System.out.println("*** 1 robot max 3 tippje ***");
        int also = 1, felso = 3;

        int foRo = (int)(Math.random()*(felso-also+1))+also;
//        int ro1tipp;// = (int)(Math.random()*(felso-also+1))+also;
//        
//        /* tippelési logika */
//        int tippDb = 0;
//        boolean talalt = false;
//        while(!talalt && tippDb < 3){
//            ro1tipp = (int)(Math.random()*(felso-also+1))+also;
//            tippDb++;
//            talalt = foRo == ro1tipp;
//        }
//        /* kiíró logika */
//        if(foRo == ro1tipp){
//            System.out.printf("%d. tippre eltalálta\n", tippDb);
//        }else{
//            System.out.println("nem találta el 3 tippből");
//        }
//        
//        /* for ciklussal: */
//        ro1tipp = -1;
//        talalt = false;
//
//        for (tippDb = 0; !talalt && tippDb < 3; tippDb++) {
//            ro1tipp = (int)(Math.random()*(felso-also+1))+also;
//            talalt = foRo == ro1tipp;
//        }
//        /* kiíró logika */
//        if(foRo == ro1tipp){
//            System.out.printf("%d. tippre eltalálta\n", tippDb);
//        }else{
//            System.out.println("nem találta el 3 tippből");
//        }
        
        /* do/while */
        int tippDb = 0;
        int ro1tipp;
        boolean talalt;
        do {
            ro1tipp = (int)(Math.random()*(felso-also+1))+also;
            tippDb++;
            talalt = foRo == ro1tipp;
        } while (!talalt && tippDb < 3);
        
        /* kiíró logika */
        if(foRo == ro1tipp){
            System.out.printf("%d. tippre eltalálta\n", tippDb);
        }else{
            System.out.println("nem találta el 3 tippből");
        }
    }
}
