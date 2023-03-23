package osszefoglalo;

public class Elagazas {

    public static void main(String[] args) {
        boolean b = true; //true

        if (b) { //if(b == true)
            System.out.println("b: igaz");
        } else {
            System.out.println("b: hamis");
        }

        if (!b) { //if(b == false)
            System.out.println("b hamis");
            System.out.println("b false");
            System.out.println("itt nincs else ág");
        }
        
        if(3 > 5){
            System.out.println("igaz: 3 > 5");
        }else if(3 < 5){
            System.out.println("igaz: 3 < 5");
        }else{
            System.out.println("ez opcionális");
        }
        
        /* hagyományos if az EGYENLŐSÉGEKRE */
        int jegy = 2;
        String minosites = "";
        if(jegy == 1){ minosites = "elégtelen"; }
        else if (jegy == 2){ minosites = "elégséges"; }
        else{ minosites = "ez nem jegy"; /* ha a jegy nem 1-5 közötti */ }
        
        /* alternatív szerkezet(switch/case) az EGYENLŐSÉGEKRE */
        switch(jegy){
            default:
                minosites = "ez nem jegy";
                break;
            case 1:
                minosites = "elégtelen";
                break;
            case 2:
                minosites = "elégséges";
                break;
            case 3:
                minosites = "közepes";
                break;
            case 4:
                minosites = "jó";
                break;
            case 5:
                minosites = "jeles";
                break;
        }
        System.out.println("minősítés: " + minosites);
        
        switch(minosites){
            case "elégtelen":
                jegy = 1; break;
            case "elégséges":
                jegy = 2; break;
        }
    }
}
