// Clasa DistribuirePrintata care implementeaza interfata ModDistribuireRezultate
public class DistribuirePrintata implements ModDistribuireRezultate {
    public void distribuieRezultate(String rezultate) {
        System.out.println("Rezultate care au fost printate: " + rezultate);
    }
}