package oraimunka1009;

public class Negyzet {

    private int a;
    private Koord n;

    public Negyzet(int a, Koord n) {
        setA(a);
        setN(n);
    }

    private int terulet() {
        return a * a;
    }

    private void setA(int a) {
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

    private void setN(Koord n) {
        this.n = n;
    }

    /* 
    public boolean egyforma(Negyzet n){
        return this.a == n.getA();
    }
     */
    
    @Override
    public String toString() {
        return "Negyzet{a=" + getA() + ", T=" + terulet() + ", x=" + n.getX() + ", y=" + n.getY() + "}";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.a;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Negyzet other = (Negyzet) obj;
        return this.a == other.a;
    }

    

}
