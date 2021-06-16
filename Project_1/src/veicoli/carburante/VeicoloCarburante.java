package veicoli.carburante;
import veicoli.Veicolo;

public abstract class VeicoloCarburante extends Veicolo {
    private float carburanteRimanente;
    private String targa;

    public VeicoloCarburante(String posizione, boolean inAffitto, float carburanteRimanente, String targa) {
        super(posizione, inAffitto);
        this.carburanteRimanente = carburanteRimanente;
        this.targa = targa;
    }

    public VeicoloCarburante() {
        super();
    }

    public float getCarburanteRimanente() {
        return carburanteRimanente;
    }

    public void setCarburanteRimanente(float carburanteRimanente) {
        this.carburanteRimanente = carburanteRimanente;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}