//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Complex numar = new Complex(2, 5);
        System.out.println(numar.toString());

        Complex numar1 = new Complex(4, -2);
        System.out.println(numar1);

        Complex suma = new Complex();
        suma = numar.adunare(numar1);
        System.out.println(suma);

        Complex inmultire = new Complex();
        inmultire = numar.inmultire(numar1);
        System.out.println(inmultire);

        Complex[] vec = new Complex[]{numar, suma, inmultire, numar1};
        for(Complex v : vec){
            System.out.print(v + " ");
        }
        System.out.println();

        Matrice mat1 = new Matrice(5,5);
        mat1.afisare(mat1.getMat());
        System.out.println();
        Matrice mat2 = new Matrice(5,5);
        mat2.afisare(mat2.getMat());
        System.out.println();

        Complex[][] suma1 = new Complex[mat1.getNrLinii()][mat1.getNrColoane()];
        suma1 = mat1.adunareM(mat2.getMat());
        mat2.afisare(suma1);
        System.out.println();

        Complex[][] inmultireScalar = new Complex[mat1.getNrLinii()][mat1.getNrColoane()];
        inmultireScalar = mat1.inmultireCuScalarM(5);
        mat1.afisare(mat1.getMat());
        System.out.println();

        Matrice inmultireMatrici1 = new Matrice(mat2.getNrColoane(),mat1.getNrLinii());
        inmultireMatrici1 = mat1.inmultireMatrici(mat2);
        inmultireMatrici1.afisare(inmultireMatrici1.getMat());

    }

}