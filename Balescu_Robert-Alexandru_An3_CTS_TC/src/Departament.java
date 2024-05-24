import java.util.ArrayList;
import java.util.List;

// Clasa Departament care extinde clasa UnitateOrganizatorica
public class Departament extends UnitateOrganizatorica {
    private List<UnitateOrganizatorica> subunitati = new ArrayList<>();

    public Departament(String nume) {
        super(nume);
    }

    public void adauga(UnitateOrganizatorica unitate) {
        subunitati.add(unitate);
    }

    public void sterge(UnitateOrganizatorica unitate) {
        subunitati.remove(unitate);
    }

    public void afiseazaStructura() {
        System.out.println(nume);
        for (UnitateOrganizatorica unitate : subunitati) {
            unitate.afiseazaStructura();
        }
    }
}