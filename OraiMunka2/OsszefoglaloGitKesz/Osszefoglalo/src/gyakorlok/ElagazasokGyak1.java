package gyakorlok;

public class ElagazasokGyak1 {
    public static void main(String[] args) {
        int also = 1, felso = 3;
        
        System.out.println("*** 3 robot 1-1 tippje ***");
        int foRo = (int)(Math.random()*(felso-also+1))+also;//1-10
        
        int kiRo = (int)(Math.random()*(felso-also+1))+also;//1-10
        int koRo = (int)(Math.random()*(felso-also+1))+also;//1-10
        int naRo = (int)(Math.random()*(felso-also+1))+also;//1-10
        
        
        System.out.println("fő robot: " + foRo);
        System.out.println("kis robot: " + kiRo);
        System.out.println("közepes robot: " + koRo);
        System.out.println("nagy robot: " + naRo);
       
        boolean voltTalalat = false;
        if(foRo == kiRo){
            System.out.println("A kis robot eltalálta: " + foRo); 
            voltTalalat = true;
        }
        if(foRo == koRo){
            System.out.println("A közepes robot eltalálta: " + foRo); 
            voltTalalat = true;
        }
        if(foRo == naRo){
            System.out.println("A nagy robot eltalálta: " + foRo); 
            voltTalalat = true;
        }
        if(!voltTalalat){
            System.out.println("Egyik robot sem találta el!"); 
        }
        
        System.out.println("*** 1 robot max 3 tippje ***");
        foRo = (int)(Math.random()*(felso-also+1))+also;
        int ro1tipp1 = (int)(Math.random()*(felso-also+1))+also;
        int ro1tipp2 = (int)(Math.random()*(felso-also+1))+also;
        int ro1tipp3 = (int)(Math.random()*(felso-also+1))+also;
        if(foRo == ro1tipp1){
            System.out.println("az 1. tipp egyezik");
        }else if(foRo == ro1tipp2){
            System.out.println("a 2. tipp egyezik");
        }else if(foRo == ro1tipp3){
            System.out.println("a 3. tipp egyezik");
        }else{
            System.out.println("Nem találta el háromból!");
        }
        
        System.out.println("*** belépési rendszer I. ***");
        /*Prof, tanar, diak, vendeg
        switch/case break nélkül:
        */
        String szint = "diak";
        switch(szint){
            default:
                System.out.println("nem tekinthet meg tartalmat");
                break;
            case "prof":
                System.out.println("prof tartalom");
            case "tanar":
                System.out.println("tanar tartalom");
            case "diak":
                System.out.println("diak tartalom");
            case "vendeg":
                System.out.println("vendég tartalom");
            
        }
        
        System.out.println("*** belépési rendszer II. ***");
        String beFn = "a", beJsz = "a";
        String joFn = new String("a"), joJsz = "a";
        if(beFn.equals(joFn) && beJsz.equals(joJsz)){
            System.out.println("beléphetsz");
        }else{
            System.out.println("NEM léphetsz be");
        }
        
        boolean kartya = true, kp = true;
        if(kartya || kp){
            System.out.println("fizethetek");
        }else{
            System.out.println("nem tudok fizetni");
        }
    }
}
