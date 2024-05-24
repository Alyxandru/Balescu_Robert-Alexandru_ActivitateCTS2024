// Clasa PlataCard care implementeaza interfata ModPlata
public class PlataCard implements ModPlata {
    public void plateste(double suma) {
        System.out.println("Platit cu cardul: " + suma + " RON");
    }
}