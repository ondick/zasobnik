void main() throws EmptyBatohException, FullBatohException {
    Batoh batoh = new Batoh(10);

    //1.
    batoh.vlozit(new Predmet("Meč", "zbraň", 15));
    batoh.vlozit(new Predmet("Chléb", "jídlo", 20));
    batoh.vlozit(new Predmet("lektvar", "lektvar", 50));
    batoh.vlozit(new Predmet("Dřevo", "materiál", 5));
    batoh.vlozit(new Predmet("Štít", "zbraň", 10));

    //2.
    batoh.pouzit();
    System.out.println("");
    //3.
    batoh.vypsat();
    System.out.println("");
    //4.
    batoh.nahled();
    System.out.println("");
    batoh.vypsat();
    //5.
    System.out.println("");
    batoh.vyhledatPodleTypu("jídlo");
    System.out.println("");

    //7.
    batoh.rozsiritKapacitu(2);
    batoh.vypsat();

}
