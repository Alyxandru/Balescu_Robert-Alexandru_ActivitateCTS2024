// Clasa Internare
public class Internare {
    private DetaliiPacient pacient;
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Internare(DetaliiPacient pacient, int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.pacient = pacient;
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public DetaliiPacient getPacient() {
        return pacient;
    }

    public void setPacient(DetaliiPacient pacient) {
        this.pacient = pacient;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public void setNumarSalon(int numarSalon) {
        this.numarSalon = numarSalon;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public void setNumarPat(int numarPat) {
        this.numarPat = numarPat;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    public void setNumarZileSpitalizare(int numarZileSpitalizare) {
        this.numarZileSpitalizare = numarZileSpitalizare;
    }
}