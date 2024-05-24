// Clasa SistemInternare
public class SistemInternare {
    private Medic medic;
    private Salon salon;

    public SistemInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public boolean poateFiInternat(Pacient pacient) {
        return pacient.areAsigurare() && pacient.necesitaInternare() && medic.confirmaInternare(pacient) && salon.verificaDisponibilitatePat();
    }
}