package osszefoglalo;

public class Tipusok {

    public static void main(String[] args) {
        /* Változó használata */
        int szam; //deklarálás: bevezetem használatra, azaz megadom a típusát és a nevét
        szam = 56;//inicializálás, azaz 1. értékadás
        szam = 21;//értékadűás
        szam = 21*2+3;//értékadűás
        int egesz = 7;//deklarálás + inicializálás
        egesz = 7+5;//értékadás
        
        float szimpla = 5.43267F;
        szimpla = 5.43267F * 5L;
        /*-----------------------*/ 
         
        //EGÉSZEK
        byte b1 = (byte) 1129;//105
        //soutv tab
        System.out.println("b1 = " + b1);
        System.out.println("byte min: " + Byte.MIN_VALUE);
        System.out.println("byte max: " + Byte.MAX_VALUE);
        
        System.out.println("short min: " + Short.MIN_VALUE);
        System.out.println("short max: " + Short.MAX_VALUE);
        
        int i1 = 2;
        Integer i2 = 2;//int típus csomagolóosztálya
        
        //sout tab
        System.out.println(i1 + i2);
        i1 = Integer.MAX_VALUE;//benne van az int tartományban
        i1 = i1 / 2;//benne van az int tartományban
        i1 = i1 + 1;//benne van az int tartományban
        i1 = i1 * 2;//NINCS benne az int tartományban
        System.out.println("i1 = " + i1);
        System.out.println("egy egész: " + i1);
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);
        
        i1 = 123_456_789;
        long l1 = 12_345_678_901L;
        System.out.println("long min: " + Long.MIN_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);
        
        //VALÓSAK
        float f1 = 3.14F;
        System.out.println("float min: " + Float.MIN_VALUE);
        System.out.println("float max: " + Float.MAX_VALUE);
        f1 = 10F/3;
        System.out.println("10F/3 = " + f1);
        
        double d1 = 3.14;
        Double d2 = 3.14; //double típus csomagolóosztálya
        System.out.println("double min: " + Double.MIN_VALUE);
        System.out.println("double max: " + Double.MAX_VALUE);
        d1 = 10D/3;
        System.out.println("10D/3 = " + d1);
        
        //SZÖVEG
        char c1 = 'a';
        Character c2 = 'a';
        System.out.println("char min: " + Character.MIN_VALUE);
        System.out.println("char max: " + Character.MAX_VALUE);
        int ansii = Character.MIN_VALUE;
        System.out.println("ansii = " + ansii);
        ansii = Character.MAX_VALUE;
        System.out.println("ansii = " + ansii);
        System.out.println("char min: " + (int)Character.MIN_VALUE);
        System.out.println("char max: " + (int)Character.MAX_VALUE);
        System.out.println("char min: " + (char)Integer.MIN_VALUE);
        System.out.println("char max: " + (char)90);
        
        System.out.println("A(65): " + (char)65);
        System.out.println("A(65): " + (int)'A');
        
        String s;
        s = "";
        s = "a";
        s = " ";
        s = "abc";
        s = "123";
        System.out.println(s + 5);//1235
        i1 = Integer.parseInt(s);
        System.out.println(i1 + 5);//128
        
        s = "213.4";
        d1 = Double.parseDouble(s);
        System.out.println(d1 + 5);//218.4
    }
    
}
