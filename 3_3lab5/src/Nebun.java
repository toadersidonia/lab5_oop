import java.lang.Math;
public class Nebun {
    private int pozXN;
    private int pozYN;
    TablaSah myTabla;

    public Nebun(){
        pozXN = 0;
        pozYN = 0;
        myTabla = new TablaSah();
    }

    public Nebun(int pozXN, int pozYN, TablaSah myTabla){
        this.pozXN = pozXN;
        this.pozYN = pozYN;
        this.myTabla = myTabla;
    }

    public int getPozXN(){
        return pozXN;
    }
    public int getPozYN(){
        return pozYN;
    }
    public void setPozXN(int pozXN){
        this.pozXN = pozXN;
    }
    public void setPozYN(int pozYN){
        this.pozYN = pozYN;
    }

    public void mutareNebun(int i, int j, TablaSah myTabla){
        if(i >= 0 && i < 8 && j >= 0 && j < 8) { //intre 0 si 7
            if (myTabla.getElement(i, j) == "_") { //daca nu e niciun pion pe poz repsectiva
                if (Math.abs(i - pozXN) == Math.abs(j - pozYN)) {
                    myTabla.setElement(i, j, "N");
                }
            }else{
                System.out.println("Pozitia (" + i + "," + j + ") e ocupata de " + myTabla.getElement(i, j));
            }

        }else{
            System.out.println("Mutare invalida");
        }
    }

}
