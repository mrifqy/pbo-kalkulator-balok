package Bidang;

public class PersegiPanjang implements InterfaceBidang{
    public double p;
    public double l;

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setLebar(double l) {
        this.l = l;
    }

    public double getP() {
        return p;
    }

    public double getLebar() {
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
