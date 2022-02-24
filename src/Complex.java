public class Complex implements Comparable {

    //1+2i
    int re;
    int im;

    Complex(int re, int im){
        this.re = re;
        this.im = im;
    }

    public void afisare(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        //re=2 im=-5
        if(im == 0){
            return String.valueOf(re);
        }
        if(re==0){
            return im+"i";
        }
        if(im < 0)
            return re + "" + im + "i";
        else
            return re + "+" + im + "i";
    }
    public Complex add(Complex z2){
        Complex rez = new Complex(0,0);
        rez.im = this.im + z2.im;
        rez.re = this.re + z2.re;
        return rez;
    }

    public Double modul(){
        return Math.sqrt(re*re+Math.pow(im,2));
    }

    public int compareTo(Object o) {
        if(o.getClass() != this.getClass()) return 1;
        Complex o1 = (Complex) o;
        return modul().compareTo(o1.modul());
    }
}
