package Ruang;

import Bidang.PersegiPanjang;
public class Balok extends PersegiPanjang implements InterfaceRuang{
    private double t;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public Balok(double t, double p, double l) {
        super(p, l);
        this.t = t;
    }

    @Override
    public double volume() {
        return this.luas()*this.t;
    }

    @Override
    public double luasPermukaan() {
        double p, l, t;
        p = this.p;
        l = this.l;
        t = this.t;
        return 2*((p*l)+(p*t)+(l*t)) ;
    }


}
