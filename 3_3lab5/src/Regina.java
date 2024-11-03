import java.lang.Math;
public class Regina {
    private int pozXR;
    private int pozYR;
    TablaSah myTabla;

    public Regina(){
        pozXR = 0;
        pozYR = 0;
        myTabla = new TablaSah();
    }

    public Regina(int pozXR, int pozYR, TablaSah myTabla){
        this.pozXR = pozXR;
        this.pozYR = pozYR;
        this.myTabla = myTabla;
    }

    public int getPozXR(){
        return pozXR;
    }
    public int getPozYR(){
        return pozYR;
    }
    public void setPozXR(int pozXR){
        this.pozXR = pozXR;
    }
    public void setPozYR(int pozYR){
        this.pozYR = pozYR;
    }

    public void mutareRegina(int i, int j, TablaSah myTabla){
        if(i >= 0 && i < 8 && j >= 0 && j < 8) { //intre 0 si 7
            if (myTabla.getElement(i, j) == "_") { //daca nu e niciun pion pe poz repsectiva
                if (Math.abs(i - pozXR) == Math.abs(j - pozYR) || (pozXR == i && pozYR != j || j == pozYR && pozXR != i) ) {
                    myTabla.setElement(i, j, "R");
                }
            }else{
                System.out.println("Pozitia (" + i + "," + j + ") e ocupata de " + myTabla.getElement(i, j));
            }

        }else{
            System.out.println("Mutare invalida");
        }
    }

}
