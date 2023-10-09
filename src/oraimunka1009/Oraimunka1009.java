
package oraimunka1009;

public class Oraimunka1009 {

    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        Negyzet n1 = new Negyzet();
        n1.setA(1);
        n1.setX(20);
        n1.setY(30);
        System.out.println(n1.allapot());
        
    }
    
}
