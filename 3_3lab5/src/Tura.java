import java.lang.Math;
public class Tura {
    private int pozXT;
    private int pozYT;
    TablaSah myTabla;

    public Tura(){
        pozXT = 0;
        pozYT = 0;
        myTabla = new TablaSah();
    }

    public Tura(int pozXT, int pozYT, TablaSah myTabla){
        this.pozXT = pozXT;
        this.pozYT = pozYT;
        this.myTabla = myTabla;
    }

    public int getPozXT(){
        return pozXT;
    }
    public int getPozYT(){
        return pozYT;
    }
    public void setPozXT(int pozXT){
        this.pozXT = pozXT;
    }
    public void setPozYT(int pozYT){
        this.pozYT = pozYT;
    }

    public void mutareTura(int i, int j, TablaSah myTabla){
        if(i >= 0 && i < 8 && j >= 0 && j < 8) { //intre 0 si 7
            if (myTabla.getElement(i, j) == "_") { //daca nu e niciun pion pe poz repsectiva
                if (pozXT == i && pozYT != j || j == pozYT && pozXT != i) {
                    myTabla.setElement(i, j, "T");
                }
            }else{
                System.out.println("Pozitia (" + i + "," + j + ") e ocupata de " + myTabla.getElement(i, j));
            }

        }else{
            System.out.println("Mutare invalida");
        }
    }

}
