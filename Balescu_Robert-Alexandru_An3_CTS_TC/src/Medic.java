// Clasa Medic care implementeaza interfata PersonalSpital
public class Medic implements PersonalSpital {
    public void lucreaza() {
        System.out.println("Medicul ofera tratament.");
    }
    public boolean confirmaInternare(Pacient pacient) {
        return pacient.necesitaInternare();
    }
}