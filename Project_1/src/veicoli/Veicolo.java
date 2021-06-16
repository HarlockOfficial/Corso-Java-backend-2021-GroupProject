package veicoli;
import Enumerations.Patente;

public abstract class Veicolo {
    private static int counterId = 0;
    private int id;
    private String posizione;
    private boolean inAffitto;
    private float tariffaMinuto;
    private Patente patenteRichiesta;

    public Veicolo(String posizione, boolean inAffitto) {
        this.id = counterId++;
        this.posizione = posizione;
        this.inAffitto = inAffitto;
    }

    public Veicolo() {
    }

    /****** GETTERS AND SETTERS ******/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public boolean getInAffitto() {
        return inAffitto;
    }

    public void setInAffitto(boolean inAffitto) {
        this.inAffitto = inAffitto;
    }

    public float getTariffaMinuto() {
        return tariffaMinuto;
    }

    public void setTariffaMinuto(float tariffaMinuto) {
        this.tariffaMinuto = tariffaMinuto;
    }

    public Patente getPatenteRichiesta() {
        return patenteRichiesta;
    }

    public void setPatenteRichiesta(Patente patenteRichiesta) {
        this.patenteRichiesta = patenteRichiesta;
    }
}
