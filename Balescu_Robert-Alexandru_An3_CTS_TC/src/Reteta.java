// Clasa Reteta
public class Reteta {
    private static Reteta instance;

    private Reteta() {
        // Constructor privat
    }

    public static Reteta getInstance() {
        if (instance == null) {
            instance = new Reteta();
        }
        return instance;
    }

    public void utilizeazaReteta() {
        System.out.println("Utilizare reteta existenta.");
    }
}
