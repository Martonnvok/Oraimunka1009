
package oraimunka1009;

public class Oraimunka1009 {

    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        Negyzet n1 = new Negyzet();
        Koord k1 = new Koord();
        n1.setA(1);
        System.out.println(n1.allapot());
        k1.setX(20);
        k1.setY(30);
        System.out.println(k1.allapot());
        
        
    }
    
}
