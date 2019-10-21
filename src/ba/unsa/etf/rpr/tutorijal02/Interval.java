package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    public double pocetnaTacka, krajnjaTacka;
    public boolean pocetnaPripada, krajnjaPripada;

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean pocetnaPripada, boolean krajnjaPripada) {
        if(krajnjaTacka > pocetnaTacka) throw new IllegalArgumentException();
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pocetnaPripada = pocetnaPripada;
        this.krajnjaPripada = krajnjaPripada;
    }

    public Interval() {
        pocetnaTacka = 0;
        krajnjaTacka = 0;
        pocetnaPripada = false;
        krajnjaPripada = false;
    }

    public double getPocetnaTacka() {
        return pocetnaTacka;
    }

    public double getKrajnjaTacka() {
        return krajnjaTacka;
    }

    public boolean isPocetnaPripada() {
        return pocetnaPripada;
    }

    public boolean isKrajnjaPripada() {
        return krajnjaPripada;
    }

    public void setPocetnaTacka(double pocetnaTacka) {
        this.pocetnaTacka = pocetnaTacka;
    }

    public void setKrajnjaTacka(double krajnjaTacka) {
        this.krajnjaTacka = krajnjaTacka;
    }

    public void setPocetnaPripada(boolean pocetnaPripada) {
        this.pocetnaPripada = pocetnaPripada;
    }

    public void setKrajnjaPripada(boolean krajnjaPripada) {
        this.krajnjaPripada = krajnjaPripada;
    }

    public boolean isIn(double v) {
        if((v > pocetnaTacka && v < krajnjaTacka) || (v == pocetnaTacka && pocetnaPripada == true)
                || ( v == krajnjaTacka && krajnjaPripada == true))
            return true;
        else return false;

    }

    public boolean isNull() {
        if(pocetnaTacka == krajnjaTacka) return true;
        else return false;
    }
    public Interval intersect(Interval i){
        Interval presjekIntervala = new Interval();

        return presjekIntervala;
    }
    public Interval intersect(Interval i1,Interval i2){
        return i1.intersect(i2);
    }
}
