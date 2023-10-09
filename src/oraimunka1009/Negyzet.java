package oraimunka1009;

public class Negyzet {

    int a;
    int x;
    int y;

    private int terulet() {
        return a * a;
    }

    public void allapot() {
        System.out.println("Negyzet{a=" + a + ", T=" + terulet() + ", x=" + x + ", y=" + y + "}");
    }
    
}
