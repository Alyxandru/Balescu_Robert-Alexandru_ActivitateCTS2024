// Clasa ManagerRezultate
public class ManagerRezultate {
    private ModDistribuireRezultate modDistribuire;

    public ManagerRezultate(ModDistribuireRezultate modDistribuire) {
        this.modDistribuire = modDistribuire;
    }

    public void setModDistribuire(ModDistribuireRezultate modDistribuire) {
        this.modDistribuire = modDistribuire;
    }

    public void distribuieRezultate(String rezultate) {
        modDistribuire.distribuieRezultate(rezultate);
    }
}