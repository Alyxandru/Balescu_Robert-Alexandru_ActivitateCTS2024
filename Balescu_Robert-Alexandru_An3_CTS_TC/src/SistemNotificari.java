import java.util.ArrayList;
import java.util.List;

// Clasa SistemNotificari
public class SistemNotificari {
    private List<Observator> observatori = new ArrayList<>();

    public void aboneaza(Observator observator) {
        observatori.add(observator);
    }

    public void dezaboneaza(Observator observator) {
        observatori.remove(observator);
    }

    public void trimiteNotificare(String mesaj) {
        for (Observator observator : observatori) {
            observator.primesteNotificare(mesaj);
        }
    }
}
