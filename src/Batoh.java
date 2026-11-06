import java.util.Arrays;

class Batoh {
    private Predmet[] zasobnik;
    private int top;

    public Batoh(int pocatecniKapacita) {
        this.zasobnik = new Predmet[pocatecniKapacita];
        this.top = -1;
    }

    public boolean jePrazdny() {
        return top == -1;
    }

    public boolean jePlny() {
        return top == zasobnik.length - 1;
    }

    // 1.
    public void vlozit(Predmet predmet) throws FullBatohException {
        if (jePlny()) {
            throw new FullBatohException("Batoh je plný! Předmět '" + predmet.getNazev() + "' nelze vložit.");
        }
        top++;
        zasobnik[top] = predmet;
        System.out.println("Vloženo: " + predmet.getNazev());
    }

    //2.
    public void pouzit() throws EmptyBatohException {
        if (jePrazdny()) {
            throw new EmptyBatohException("Batoh je prázdný.");
        }
        Predmet prvek = zasobnik[top];
        zasobnik[top] = null;
        top--;
        System.out.println("Použito: " + prvek.getNazev() + " (typ: " + prvek.getTyp() + ")");
    }

    //3.
    public void vypsat() throws EmptyBatohException {
        if (jePrazdny()) {
            throw new EmptyBatohException("Batoh je prázdný.");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(zasobnik[i].getNazev());
        }
    }

    //4.
    public void nahled() throws EmptyBatohException {
        if (jePrazdny()) {
            throw new EmptyBatohException("Batoh je prázdný.");
        }
        Predmet prvek = zasobnik[top];
        System.out.println("Dalsi: " + prvek.getNazev() + " (typ: " + prvek.getTyp() + ")");
    }

    //5.
    public void vyhledatPodleTypu(String hledanyTyp) throws EmptyBatohException {
        if (jePrazdny()) {
            throw new EmptyBatohException("Batoh je prázdný.");
        }

        boolean nalezeno = false;
        for (int i = top; i >= 0; i--) {
            if (zasobnik[i].getTyp().equalsIgnoreCase(hledanyTyp)) {
                System.out.println(zasobnik[i]);
                nalezeno = true;
            }
        }
        if (!nalezeno) {
            System.out.println("neni tam '" + hledanyTyp + "' brother");
        }
    }

    public void rozsiritKapacitu(int oKolik) {
        if (oKolik <= 0) {
            System.out.println("ty si debil.");
            return;
        }
        int novaKapacita = zasobnik.length + oKolik;
        zasobnik = Arrays.copyOf(zasobnik, novaKapacita);
        System.out.println("Kapacita batohu ted: " + novaKapacita + " předmětů.");
    }
}

