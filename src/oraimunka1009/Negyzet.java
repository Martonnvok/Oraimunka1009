package oraimunka1009;

public class Negyzet {

    private int a;
    private Koord n;

    private int terulet() {
        return a * a;
    }
    
    

    public void setA(int a) {
        if (1 > a) {
            a = 1;
        }
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public Koord getN() {
        return n;
    }

    public void setN(Koord n) {
        this.n = n;
    }

    public String allapot() {
        return "Negyzet{a=" + getA() + ", T=" + terulet() + ", x=" + n.getX() + ", y=" + n.getY() + "}";
    }

}
