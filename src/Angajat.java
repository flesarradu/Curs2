public class Angajat extends Persoana {
    String functie;
    int salariu;
    public Angajat(){
        super();
        functie = "null";
        salariu = 0;
    }
    public Angajat(String nume, String prenume, int varsta, String adresa,String functie, int salariu){
        super(nume, prenume, varsta, adresa);
        this.functie = functie;
        this.salariu = salariu;
    }
    public Angajat(String nume, String prenume, String functie, int salariu){
        super(nume, prenume);
        this.functie = functie;
        this.salariu = salariu;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                " functie='" + functie + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
