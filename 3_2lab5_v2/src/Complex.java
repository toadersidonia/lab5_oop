public class Complex {
    private int parteaReala;
    private int parteaImaginara;

    public Complex(){
        parteaReala = 0;
        parteaImaginara = 0;
    }

    public Complex(int parteaReala, int parteaImaginara){
        this.parteaReala = parteaReala;
        this.parteaImaginara = parteaImaginara;
    }

    public String toString(){
        if(parteaImaginara >= 0){
            return parteaReala + "+" + parteaImaginara + "i";
        }else{
            return parteaReala + "" + parteaImaginara + "i";
        }
    }

    public Complex adunare(Complex nr){
        Complex suma = new Complex();
        suma.parteaReala = parteaReala + nr.parteaReala;
        suma.parteaImaginara = parteaImaginara + nr.parteaImaginara;

        //System.out.println(suma);
        return suma;
    }


    public Complex scadere(Complex nr){
        Complex diferenta = new Complex();
        diferenta.parteaReala = parteaReala - nr.parteaReala;
        diferenta.parteaImaginara = parteaImaginara - nr.parteaImaginara;

        return diferenta;
    }

    public Complex inmultire(Complex nr){
        Complex inmultire = new Complex();
        inmultire.parteaReala = parteaReala * nr.parteaReala + parteaImaginara * nr.parteaImaginara;
        inmultire.parteaImaginara = parteaReala * nr.parteaImaginara + nr.parteaReala * parteaImaginara;

        return inmultire;
    }

    public Complex inmultireCuScalar(int scalar){
        Complex inmultire = new Complex();
        inmultire.parteaReala = parteaReala * scalar;
        inmultire.parteaImaginara = parteaImaginara * scalar;

        return inmultire;
    }
}
