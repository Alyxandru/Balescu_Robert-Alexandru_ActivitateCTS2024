import java.util.HashMap;
import java.util.Map;

// Clasa PersonalSpitalFactoryExtensibil
public class PersonalSpitalFactoryExtensibil {
    private static Map<TipPersonal, PersonalSpital> registry = new HashMap<>();

    static {
        registry.put(TipPersonal.BRANCARDIER, new Brancardier());
        registry.put(TipPersonal.ASISTENT, new Asistent());
        registry.put(TipPersonal.MEDIC, new Medic());
    }

    public static void registerPersonal(TipPersonal tip, PersonalSpital personal) {
        registry.put(tip, personal);
    }

    public static PersonalSpital createPersonal(TipPersonal tip) {
        PersonalSpital personal = registry.get(tip);
        if (personal == null) {
            throw new IllegalArgumentException("Tip necunoscut de personal.");
        }
        return personal;
    }
}