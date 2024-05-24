// Clasa Sectie care extinde clasa UnitateOrganizatorica
public class Sectie extends UnitateOrganizatorica {
    public Sectie(String nume) {
        super(nume);
    }

    public void adauga(UnitateOrganizatorica unitate) {
        System.out.println("Operatiunea nu este suportata");
    }

    public void sterge(UnitateOrganizatorica unitate) {
        System.out.println("Operatiunea nu este suportata");
    }

    public void afiseazaStructura() {
        System.out.println("  " + nume);
    }
}