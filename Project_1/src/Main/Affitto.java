package Main;

import veicoli.Veicolo;

import java.time.LocalDateTime;

public class Affitto {

    private static int counterId = 0;
    private int id;

    private Utente cliente;
    private Veicolo veicoloAffittato;
    private LocalDateTime dataAffitto;
    private int durata;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utente getCliente() {
        return cliente;
    }

    public void setCliente(Utente cliente) {
        this.cliente = cliente;
    }

    public Veicolo getVeicoloAffittato() {
        return veicoloAffittato;
    }

    public void setVeicoloAffittato(Veicolo veicoloAffittato) {
        this.veicoloAffittato = veicoloAffittato;
    }

    public LocalDateTime getDataAffitto() {
        return dataAffitto;
    }

    public void setDataAffitto(LocalDateTime dataAffitto) {
        this.dataAffitto = dataAffitto;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }


    public Affitto() {
        this.id = counterId++;
        setCliente(cliente);
        setDataAffitto(dataAffitto);
        setId(id);
        setVeicoloAffittato(veicoloAffittato);
    }
}