package ciklusok;

import java.util.Scanner;

public class Szamok {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("ismétléssel (i/n): ");
        //String v = sc.next();
        boolean ismetlessel = sc.next().equals("i");
        
        int ismDb = 0, ismNlkDb = 0;
        for (int i = 2; i <= 4; i++) {
            for (int j = 2; j <= 4; j++) {
                for (int k = 2; k <= 4; k++) {
                    //if(v.equals("i")){
                    if(ismetlessel){
                        System.out.println("" + i+j+k);
                        ismDb++;
                    }else if(i != j && i != k && j != k){
                        System.out.println("" + i+j+k);
                        ismNlkDb++;
                    }
                }
            }
        }
        if(ismetlessel){
            System.out.println("ismétléssel az összes permutáció: " + ismDb);
        }else{
            System.out.println("ismétlés nélkül az összes permutáció: " + ismNlkDb);
        }
    }
}
