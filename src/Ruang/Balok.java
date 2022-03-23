package Ruang;

import Bidang.PersegiPanjang;
public class Balok extends PersegiPanjang implements InterfaceRuang{
    private int t;

    public int getT() {
        return t;
    }

    public Balok(int t, int p, int l) {
        super(p, l);
        this.t = t;
    }

    @Override
    public double volume() {
        return this.luas()*this.t;
    }

    @Override
    public double luasPermukaan() {
        int p, l, t;
        p = this.p;
        l = this.l;
        t = this.t;
        return 2*((p*l)+(p*t)+(l*t)) ;
    }

    public void setT(int t) {
        this.t = t;
    }
}
