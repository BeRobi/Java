package osszefoglalo;

public class Kiirasok {
    //psvm tab
    public static void main(String[] args) {
        System.out.println("7+3 = " + 7+3);
        System.out.println("7-3 = " + (7-3));
        System.out.println("7/3,0 = " + 7/3.0);
        System.out.println("1.0*7/3 = " + 1.0*7/3);
        System.out.println("7F/3 = " + 7F/3);
        System.out.println("(double)7/3 = " + (double)7/3);
        
        int a = 7, b = 3;
        System.out.println(a + "+" + b + " = " + (a+b));
        System.out.println(a + "/" + b + " = " + (float)a/b);
        
        System.out.printf("%d+%d = %d\n", a, b, a+b);
        
        double v = 3.14;
        String s = "Pál";
        long l = 1_234L;
        char c = '*';
        System.out.printf("%d --> %f : %s | %c...%d--%d (%s)\n", a, v, s, c, 21, l, "vége");
        
        double eredmeny = 10F/3;
        System.out.printf("10/3=%.4f\n", eredmeny);
        
        System.out.printf(">%5s<\n","aaa");
        System.out.printf(">%-5s<\n","aaa");
        
        v = 3.1415;
        float f = 23.45F;
        System.out.printf("%10.4f\n",v);
        System.out.printf("%10.4f\n",f);
        System.out.printf("%10.4f\n",(float)a);
        System.out.printf("%10.4f\n",(double)l);
        
        final int HOSSZ = 8;//konstans érték, csak inicializálható
        //HOSSZ = 17;
        String forma = "%" + HOSSZ + "s\n";
        System.out.printf(forma,"!");
        System.out.printf("%8s\n","ó!");
        System.out.printf("%8s\n","ió!");
        System.out.printf("%8s\n","ció!");
        System.out.printf("%8s\n","áció!");
        System.out.printf("%8s\n","káció!");
        System.out.printf("%8s\n","akáció!");
        System.out.printf("%8s\n","Vakáció!");
    }
}
