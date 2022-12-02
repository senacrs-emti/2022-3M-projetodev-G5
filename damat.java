public class DamaT {

    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro(10);

        tab.imprimirTabuleiro();

        tab.moverPeca("4B,5A");
        tab.moverPeca("7a,6b");

    }
}