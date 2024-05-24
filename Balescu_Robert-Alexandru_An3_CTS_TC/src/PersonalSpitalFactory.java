// Clasa PersonalSpitalFactory
// Utilizat in PersonalSpitalFactory pentru a crea obiecte din diferite clase ce
// implementeaza interfata PersonalSpital in functie de tipul specificat. Acest
// lucru centralizeaza crearea obiectelor de tip personal intr-un singur loc,
// facilitand managementul si eventuala extindere a tipurilor de personal.
public class PersonalSpitalFactory {
    public static PersonalSpital createPersonal(TipPersonal tip) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                throw new IllegalArgumentException("Tip necunoscut de personal.");
        }
    }
}