package SistemaDeGestaoDeCores;

public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "0,0", 10);
        formaManager.addForma("Azul", "1,1", 20);
        formaManager.addForma("Verde", "2,2", 15);
        formaManager.addForma("Vermelho", "3,3", 30);
        formaManager.addForma("Amarelo", "4,4", 25);
        formaManager.addForma("Azul", "5,5", 35);

        formaManager.apresentar();
    }
}
