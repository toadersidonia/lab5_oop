import java.util.Random;
public class Matrice {
    private int nrLinii;
    private int nrColoane;
    Complex[][] mat;

    public Matrice(){
        nrLinii = 0;
        nrColoane = 0;
        mat = new Complex[nrLinii][nrColoane];
    }

    public Matrice(int nrLinii, int nrColoane){
        this.nrLinii = nrLinii;
        this.nrColoane = nrColoane;
        mat = new Complex[nrLinii][nrColoane];
        for(int i = 0; i < nrLinii; i++){
            for(int j = 0; j < nrColoane; j++){
                mat[i][j] = new Complex(new Random().nextInt(10), new Random().nextInt(10) );
            }
        }
    }

    public int getNrLinii(){
        return nrLinii;
    }

    public int getNrColoane(){
        return nrColoane;
    }

    public void afisare(Complex[][] matrice){
        for(int i = 0; i < nrLinii; i++){
            for(int j = 0; j < nrColoane; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Complex[][] adunareM(Complex[][] m){
        Complex[][] adunare = new Complex[nrLinii][nrColoane];
        for(int i = 0 ; i < nrLinii; i++){
            for(int j = 0 ; j < nrColoane; j++){
                adunare[i][j] = mat[i][j].adunare(m[i][j]);
            }
        }
        return adunare;
    }

    public Complex[][] inmultireCuScalarM(int nr){
        for(int i = 0; i < nrLinii; i++){
            for(int j = 0; j < nrColoane; j++){
                mat[i][j] = mat[i][j].inmultireCuScalar(nr);
            }
        }
        return mat;
    }

    public Matrice inmultireMatrici(Matrice a){
        if(nrColoane > a.getNrLinii()){
            System.out.println("Nu se poate efectua inmultirea");
            return null;
        }
        int nrColA = a.getNrColoane();
        Complex suma = new Complex();
        Matrice inmultireMat = new Matrice(a.getNrColoane(), nrLinii);
        for(int i = 0; i < nrLinii; i++){
            for(int j = 0 ; j < nrColA; j++) {
                suma = new Complex();
                for (int k = 0; k < nrColoane; k++) {
                    suma = suma.adunare(mat[i][k].inmultire(a.mat[k][j]));
                }
                inmultireMat.mat[i][j] = suma;
            }
        }
        return inmultireMat;
    }

    public Complex[][] getMat(){
        return mat;
    }

}
