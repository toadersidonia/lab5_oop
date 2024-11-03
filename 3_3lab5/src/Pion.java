import java.lang.Math;

public class Pion {
    private int pozXP;
    private int pozYP;
    TablaSah myTabla;

    public Pion(){
        pozXP = 0;
        pozYP = 0;
        myTabla = new TablaSah();
    }

    public Pion(int pozXP, int pozYP, TablaSah myTabla){
        this.pozXP = pozXP;
        this.pozYP = pozYP;
        this.myTabla = myTabla;
    }

    public int getPozXP(){
        return pozXP;
    }
    public int getPozYP(){
        return pozYP;
    }
    public void setPozXP(int pozXP){
        this.pozXP = pozXP;
    }
    public void setPozYP(int pozYP){
        this.pozYP = pozYP;
    }

    public void mutarePion(int i, int j, TablaSah myTabla){
        if(i >= 0 && i < 8 && j >= 0 && j < 8) { //intre 0 si 7
            if (myTabla.getElement(i, j) == "_") { //daca nu e niciun pion pe poz repsectiva
                if ((i - pozXP) == 1 && (pozYP == j)) {
                    myTabla.setElement(i, j, "P");
                }
            }else{
                System.out.println("Pozitia (" + i + "," + j + ") e ocupata de " + myTabla.getElement(i, j));
            }

        }else{
            System.out.println("Mutare invalida");
        }
    }

}
