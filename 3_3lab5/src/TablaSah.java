public class TablaSah {
    private static final int nrLinii = 8;
    private static final int nrColoane = 8;
    private String[][] mat;

    //mostenire, facem o clasa abstract? si facem override functiei cu mutarea
    public TablaSah(){
        mat = new String[nrLinii][nrColoane];
        for(int i = 0 ; i < nrLinii; i++){
            for(int j = 0 ; j < nrColoane; j++){
                mat[i][j] = "_";
            }
        }
    }

    public String[][] getTablaSah(){
        return mat;
    }

    public String getElement(int i, int j){
        return mat[i][j];
    }

    public void setElement(int i, int j, String val){
        mat[i][j] = val;
    }

    public void afisare(){
        for(int i = 0 ; i < nrLinii; i++){
            for(int j = 0 ; j < nrColoane; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
