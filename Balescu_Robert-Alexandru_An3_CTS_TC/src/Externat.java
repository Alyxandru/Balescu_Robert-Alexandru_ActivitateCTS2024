// Clasa Externat care implementeaza interfata StarePacient
public class Externat implements StarePacient {
    public void gestioneazaStare(Pacient pacient) {
        System.out.println("Pacientul este externat.");
    }
}