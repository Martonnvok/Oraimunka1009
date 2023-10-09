package oraimunka1009;

public class Negyzet {

    private int a;
    private int x;
    private int y;

    private int terulet() {
        return a * a;
    }

    public void setA(int a) {
        if (1 > a) {
            a = 1;
        }
        this.a = a;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getA() {
        return a;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    

    public String allapot() {
        return "Negyzet{a=" + getA() + ", T=" + terulet() + ", x=" + getX() + ", y=" + getY() + "}";
    }
    
}
