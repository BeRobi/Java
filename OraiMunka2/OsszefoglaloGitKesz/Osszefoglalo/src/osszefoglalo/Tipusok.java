package osszefoglalo;

public class Tipusok {

    public static void main(String[] args) {
        System.out.println("EGÉSZEK");
        byte b1 = (byte) 1129;
        System.out.println("(byte) 1129 -->" + b1);//105
        System.out.println("byte min: " + Byte.MIN_VALUE);//-128
        System.out.println("byte max: " + Byte.MAX_VALUE);//127
        
        System.out.println("short min: " + Short.MIN_VALUE);
        System.out.println("short max: " + Short.MAX_VALUE);
        
        int i1 = 7;
        Integer i2 = 7;//a int típus csomagolóosztálya
        i1 = Integer.MAX_VALUE;//ez még elfér az int-ben
        i1 = i1 / 2;//ez még elfér az int-ben
        i1 = i1 + 1;//ez még elfér az int-ben
        i1 = i1 * 2;//ez már NEM fér el
        System.out.println("int --> " + i1);
        i1 = 123_456_789;
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);
        
        long l1 = 12_345_678_901L;
        System.out.println("long min: " + Long.MIN_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);
        
        System.out.println("VALÓSAK");
        float f1 = 3.14F;
        f1 = 10F/3;
        System.out.println("10F/3 -->" + f1);
        System.out.println("float min: " + Float.MIN_VALUE);
        System.out.println("float max: " + Float.MAX_VALUE);
        
        double d1 = 2.3;
        Double d2 = 2.3;//a double típus csomagolóosztálya
        d1 = 10D/3;
        System.out.println("10D/3 -->" + d1);
        System.out.println("double min: " + Double.MIN_VALUE);
        System.out.println("double max: " + Double.MAX_VALUE);
        
        System.out.println("KARAKTER");
        char c1 = 'a';
        Character c2 = 'a';
        System.out.println("character min: " + Character.MIN_VALUE);
        System.out.println("character max: " + Character.MAX_VALUE);
        int egesz = Character.MIN_VALUE;
        System.out.println(egesz);
        egesz = Character.MAX_VALUE;
        System.out.println(egesz);
        System.out.println("character min: " + (int)Character.MIN_VALUE);
        System.out.println("character max: " + (int)Character.MAX_VALUE);
        
        String s1;
        s1 = "";
        s1 = "a";
        s1 = "abc";
        s1 = "123";
        System.out.println(s1+5);//1235
        i1 = Integer.parseInt(s1);//szövegből szám, ha csak számjegyeket tartalmaz
        System.out.println(i1+5);//128
        System.out.println("123+5=" + i1+5);//123+5=1235, ez számból szöveg, mert a szám elé v mögé fűztem szöveget
        System.out.println("123+5=" + (i1+5));//123+5=128
    }
    
}
