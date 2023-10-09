package oraimunka1009;

public class Koord {

    private int x;
    private int y;

    public Koord(int x, int y) {
        setX(x);
        setY(y);
    }

    
    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
