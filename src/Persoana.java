import java.util.Objects;

public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;
    public Persoana(){
        nume = "null";
        prenume = "null";
        varsta = 0;
        adresa = "null";
    }

    public Persoana(String nume, String prenume) {
        this(nume, prenume, 0 , "Sibelius" );
    }

    public Persoana(String nume, String prenume, int varsta, String adresa){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }


    public void afisare(){
        System.out.printf("Nume: %s\nPrenume: %s\nVarsta: %d\nAdresa: %s\n", nume,prenume,varsta,adresa);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public int getVarsta() {
        return varsta;
    }
    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public void setVarsta(int varsta){
        if(varsta > 0 && varsta < 200){
            this.varsta = varsta;
        }
    }

    public String getAdresa() {
        return adresa;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(this.nume, persoana.nume) && Objects.equals(this.prenume, persoana.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume);
    }

    static void f(Persoana x){
        System.out.println(x.nume);
    }
}