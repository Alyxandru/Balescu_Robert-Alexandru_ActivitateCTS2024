// Clasa abstracta UnitateOrganizatorica
public abstract class UnitateOrganizatorica {
    protected String nume;

    public UnitateOrganizatorica(String nume) {
        this.nume = nume;
    }

    public abstract void adauga(UnitateOrganizatorica unitate);
    public abstract void sterge(UnitateOrganizatorica unitate);
    public abstract void afiseazaStructura();
}