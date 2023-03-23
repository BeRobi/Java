package osszefoglalo;

import java.util.Random;

public class VelSzam {
    public static void main(String[] args) {
        double d = Math.random();
        System.out.println("d = " + d);
        int dobas = (int)(Math.random()*6);//0 - 5, ez 6 db szám
        dobas = (int)(Math.random()*6+1);//1 - 6
        System.out.println("dobas = " + dobas);
        
        int also = 13, felso = 15;
        int vsz = (int)(Math.random()*(felso-also+1)+also);
        System.out.println("13-15: " + vsz);
        
        Random r = new Random();
        vsz = r.nextInt(6);//0 - 5, ez 6 db szám
        vsz = r.nextInt(6)+1;//1 - 6
        vsz = r.nextInt(felso-also+1)+also;
        System.out.println("vsz: " + vsz);
    }
}
