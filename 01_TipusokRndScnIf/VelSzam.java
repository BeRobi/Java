package osszefoglalo;

import java.util.Random;

public class VelSzam {
    public static void main(String[] args) {
        double vszMr = Math.random();
        System.out.println("vszMr = " + vszMr);
        
        int dobas = (int) (Math.random()*6);//6 db számból 1, ami 0-5 közötti
        dobas = (int) (Math.random()*6+1);//6 db számból 1, ami 1-6 közötti
        System.out.println("dobas = " + dobas);
        
        int also = 13, felso = 15;
        int vsz = (int)(Math.random()*(felso-also+1)+also);
        System.out.println("13-15: " + vsz);
        
        Random rnd = new Random();
        int vszRn = rnd.nextInt();
        System.out.println("vszRn = " + vszRn);
        dobas = rnd.nextInt(6-1+1)+1;
        System.out.println("dobas = " + dobas);
        vsz = rnd.nextInt(felso-also+1)+also;
        System.out.println("13-15: " + vsz);
        
        System.out.println("éáűőúóüö");
    }
}
