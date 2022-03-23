package Bidang;

public class PersegiPanjang implements InterfaceBidang{
    public int p;
    public int l;

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setLebar(int l) {
        this.l = l;
    }

    public int getP() {
        return p;
    }

    public int getLebar() {
        return l;
    }

    @Override
    public double luas() {
        return this.p*this.l;
    }

    @Override
    public double keliling() {
        return 2*(this.p+this.l);
    }
}
