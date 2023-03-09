package osszefoglalo;

public class Elagazas {

    public static void main(String[] args) {
        boolean b = false; //false
        if (b == true) { //if(b)
            System.out.println("b: igaz");
        } else {
            System.out.println("b: hamis");
        }

        if (!b) { //if(b == false)
            System.out.println("b hamis");
            System.out.println("b false");
            System.out.println("nincs else ág");
        }
        
        if(3 > 5){
            System.out.println("igaz: 3 > 5");
        }else if(3 < 5){
            System.out.println("igaz: 3 < 5");
        }else{
            System.out.println("opcionális");
        }
    }
}
