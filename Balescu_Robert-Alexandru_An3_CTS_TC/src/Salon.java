import java.util.List;

// Clasa Salon
public class Salon {
    private List<Boolean> paturi;  // true pentru pat ocupat, false pentru liber

    public Salon(List<Boolean> paturi) {
        this.paturi = paturi;
    }

    public boolean verificaDisponibilitatePat() {
        return paturi.contains(false);
    }
}