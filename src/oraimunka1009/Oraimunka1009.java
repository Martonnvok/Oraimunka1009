package oraimunka1009;

public class Oraimunka1009 {

    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        Koord k1 = new Koord(20, 30);
        Negyzet n1 = new Negyzet(5, k1);

        System.out.println(n1.toString());

    }

}
