package gyakorlok;

import java.util.Random;

public class TombokGyak1 {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        /* 10 elemű tömbben a páratlan indexeken legyen páros szám, a páros indexeken legyen az 1 érték
           1 ciklus feltölti, 1 másik ciklus kiírja a tömb elemeit
        pl.:
        [0] = 1
        [1] = 1234
        [2] = 1
        ...
        [9] = 9658732
        */
        
        int[] szamok = new int[10];
        for (int i = 0; i < szamok.length; i++) {
            if(i % 2 == 0){
                szamok[i] = 1;            
            }else{
                szamok[i] = rnd.nextInt() * 2;
            }
        }
        /* hagyományos for,
           az elemek indexeken keresztüli elérésével*/
        for (int i = 0; i < szamok.length; i++) {
            int szam = szamok[i];
            System.out.printf("[%d] = %d\n",i , szam);
        }
        
        /* speciális, adatszerkezetekre használható for,
           az elemek közvetlen elérésével: */
        for (int szam : szamok) {
            System.out.printf("%d\n",szam);
        }
        
        /* érvényes  lottószelvény számai: 5db szám 1-90 között, nem ismétlődhetnek 
           használjunk logikai tömböt
        */
        /* a default érték false, ez jelenti, hogy még egyik szám sem volt a szelvényen */
        boolean[] szelveny = new boolean[91];//indexelhető: 0-90, ebből kell --> 1-90
        int joSzamDb = 0;
        //kijelölés, majd ALT+ENTER
        while (joSzamDb < 5) {            
        //do {            
            int szam = rnd.nextInt(5) + 1;//1-90
            if (!szelveny[szam]) { //if(szelveny[szam] == false){
                szelveny[szam] = true;
                joSzamDb++;
            }
        //} while (joSzamDb < 5);
        }
        
        System.out.println("ötöslottón megjátszható számok: ");
        for (int i = 1; i < szelveny.length; i++) {
            if(szelveny[i]){
                System.out.print(i + " ");
            }
        }
    }
}
