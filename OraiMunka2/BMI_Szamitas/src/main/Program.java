/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BatheltRóbert(SZF_F_
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        bmiFeladat();
    }

    private static void bmiFeladat() {
        kiir("BMI kiszámítása");

        String s;
        int also, felso;
        also = 100;
        felso = 200;
        s = "Testmagasság: (cm) [%d %d]:".formatted(also, felso);
        int m = beker(s, also, felso);

        also = 40;
        felso = 150;
        s = "Testtömeg: (cm) [%d %d]:".formatted(also, felso);
        int t = beker(s, also, felso);
        double bmi = bmiSzamit(t, m);
        ertekeles(bmi, t, m);
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    private static int beker(String kerdes, int also, int felso) {

        boolean jo;
        int szam;
        do {
            System.out.print(kerdes);
            szam = sc.nextInt();
            jo = szam >= also && szam <= felso;
        } while (!jo);

        return szam;

    }

    private static double bmiSzamit(int t, int m) {
        return t / Math.pow(m / 100.0, 2);

    }

    private static void ertekeles(double bmi, int t, int m) {
        String szoveg = "Ön... m: %d, t: %d bmi: %.1f".formatted(t, m, bmi);
        String s = String.format(Locale.UK, szoveg, m, t, bmi);
        s = s.formatted(m, t, bmi);
        kiir(s);
    }

}
