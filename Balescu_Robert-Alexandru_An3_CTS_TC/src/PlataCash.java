// Clasa PlataCash care implementeaza interfata ModPlata
public class PlataCash implements ModPlata {
    public void plateste(double suma) {
        System.out.println("Platit cash: " + suma + " RON");
    }
}
