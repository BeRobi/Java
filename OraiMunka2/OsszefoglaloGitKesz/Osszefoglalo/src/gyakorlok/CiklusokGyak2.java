package gyakorlok;

public class CiklusokGyak2 {
    public static void main(String[] args) {
        System.out.println("Számok [10, 15], de a 13 nem szerepelhet: ");
        boolean mehet = true, elso = true;
        System.out.println("*** while: ");
        while(mehet){
            int n = (int)(Math.random()*6)+10;//10-15
            mehet = n != 13;
            if(mehet){
                if(!elso){
                    System.out.print(", ");
                }
                elso = false;
                System.out.print(n);
            }
        }
        System.out.println("\n*** do/while:");
        
        elso = true;
        do {
            int n = (int)(Math.random()*6)+10;//10-15
            mehet = n != 13;
            if(mehet){
                if(!elso){
                    System.out.print(", ");
                }
                System.out.print(n);
                elso = false;
            }
        } while (mehet);
        System.out.println("");
        
        System.out.println("*** Az első 10db páratlan szám: ");
        for (int i = 1; i <= 19; i += 2) {
            System.out.printf(i + " ");
        }
        System.out.println("");
        
        System.out.println("*** Az első 10db páros kétjegyű szám, 28tól: ");
        int n = 28;
        for (int i = 0; i < 10; i++) {
            System.out.print(n + " ");
            n += 2;
        }
        System.out.println("");
        
        /* alternatív megoldás: */
//        for (int i = 0, n= 28; i < 10; i++, n+=2) {
//            System.out.print(n + " ");
//        }

        System.out.println("");
        System.out.println("*** számok abszolút értéke 3 .. -3-ig");
        for (int i = 3; i >= -3; i--) {
            System.out.printf("|%2d| = %d\n",i, Math.abs(i));
        }
    }
}
