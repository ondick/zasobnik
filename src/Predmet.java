class Predmet {
    private String nazev;
    private String typ;
    private int hodnota;

    public Predmet(String nazev, String typ, int hodnota) {
        this.nazev = nazev;
        this.typ = typ;
        this.hodnota = hodnota;
    }

    public String getNazev() {
        return nazev;
    }
    public String getTyp() {
        return typ;
    }
    public int getHodnota() {
        return hodnota;
    }

    @Override
    public String toString() {
        return nazev + " (typ: " + typ + ", hodnota: " + hodnota + ")";
    }
}