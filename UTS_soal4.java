import java.lang.Math;
class Lingkaran {
    private double r;

    //method
    public Lingkaran(){
        this.r = 0;
    }
    public Lingkaran(double jari){
        this.r = jari;
    }
    public void setR(double jari) {
        this.r = jari;
    }

    public double luas() {
        double PHI = 3.14;
        return PHI * Math.pow(this.r,2);
    }

    public static void main(String[] args){
        Lingkaran link1 = new Lingkaran();
        link1.setR(10);
        System.out.println("Luas Lingkaran 1 = " + link1.luas());

        //cara 2
        Lingkaran link2 = new Lingkaran(100);
        System.out.println("Luas Lingkaran 2 = " + link2.luas());
    }
}