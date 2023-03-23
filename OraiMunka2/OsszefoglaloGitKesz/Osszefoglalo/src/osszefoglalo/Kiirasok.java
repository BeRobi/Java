package osszefoglalo;

public class Kiirasok {
    //psvm tab
    public static void main(String[] args) {
        System.out.println("7*3 = " + 7*3);
        System.out.println("7-3 = " + (7-3));
        
        int a = 7;
        int b = 3;
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        
        long l1 = 123L;
        double v = 3.14;
        char c = '*';
        String s = "Pál";
        System.out.printf("%s->%d : %d | %f, %c...%s\n", s, l1, 1997, v, c, "vége");
        
        double eredmeny = (double)a/b;
        System.out.printf("%f\n", eredmeny);
        System.out.printf("%.2f\n", eredmeny);
        System.out.printf("%10.2f\n", eredmeny);
        
        float f1 = 3.14F;
        double d1 = 3.1415;
        System.out.printf("%16.4f\n",f1);
        System.out.printf("%-16.4f\n",d1);
        System.out.printf("%-16.4f\n",1235.0);
        System.out.printf("%-16.4f\n",(float)a);
        
        final int HOSSZ = 8;
        String f = "%"+HOSSZ+"s\n";
        System.out.printf(f, "!");
        
        System.out.printf("%8s\n", "ó!");
        System.out.printf("%8s\n", "ió!");
        System.out.printf("%8s\n", "ció!");
        System.out.printf("%8s\n", "áció!");
        System.out.printf("%8s\n", "káció!");
        System.out.printf("%8s\n", "akáció!");
        System.out.printf("%8s\n", "Vakáció!");
    }
}
