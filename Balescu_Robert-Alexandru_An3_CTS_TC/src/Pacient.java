// Clasa Pacient care implementeaza interfata Observator
public class Pacient implements Observator {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatDeInterior;
    private String nume;
    private int gravitateStare;
    private boolean areAsigurare;
    private ModPlata modPlata;
    private StarePacient stare;

    public Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatDeInterior, String nume, int gravitateStare, boolean areAsigurare) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatDeInterior = halatDeInterior;
        this.nume = nume;
        this.gravitateStare = gravitateStare;
        this.areAsigurare = areAsigurare;
    }
    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

    public void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public boolean isHalatDeInterior() {
        return halatDeInterior;
    }

    public void setHalatDeInterior(boolean halatDeInterior) {
        this.halatDeInterior = halatDeInterior;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGravitateStare() {
        return gravitateStare;
    }

    public void setGravitateStare(int gravitateStare) {
        this.gravitateStare = gravitateStare;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    public boolean necesitaInternare() {
        return gravitateStare > 5;  // o metrică simplă pentru demonstrație
    }

    public boolean areAsigurare() {
        return areAsigurare;
    }

    public void seteazaModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteSpitalizarea(double suma) {
        modPlata.plateste(suma);
    }

    public void primesteNotificare(String mesaj) {
        System.out.println("Notificare pacient: " + mesaj);
    }

    public void setStare(StarePacient stare) {
        this.stare = stare;
    }

    public void actualizeazaStare() {
        stare.gestioneazaStare(this);
    }
}
