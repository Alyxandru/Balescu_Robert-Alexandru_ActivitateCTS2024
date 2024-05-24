// Clasa MedicamentFarmacie
public class MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentFarmacie(MedicamentSpital medicament) {
        this.medicamentSpital = medicament;
    }

    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
        System.out.println("Medicamentul a fost cumparat din farmacie.");
    }
}