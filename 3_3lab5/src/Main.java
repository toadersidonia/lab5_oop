//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    TablaSah tablaSah = new TablaSah();
    Pion pion = new Pion(1, 4, tablaSah);
    tablaSah.setElement(1, 4, "P");
    Nebun nebun = new Nebun(6, 7, tablaSah);
    tablaSah.setElement(6, 7, "N");
    Tura tura = new Tura(1,1,tablaSah);
    tablaSah.setElement(1, 1, "T");
    Regina regina = new Regina(3, 6, tablaSah);
    tablaSah.setElement(3, 6, "R");
    Pion pion1 = new Pion(7, 4, tablaSah);
    tablaSah.setElement(7, 4, "P");

    tablaSah.afisare();
    System.out.println();

    pion.mutarePion(2,4, tablaSah);
    nebun.mutareNebun(2,7, tablaSah);
    tura.mutareTura(1,6, tablaSah);
    regina.mutareRegina(1,4, tablaSah);

    tablaSah.afisare();
    }
}