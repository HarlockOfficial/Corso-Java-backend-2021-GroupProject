package Main;

import veicoli.Veicolo;

import java.util.ArrayList;
import java.util.List;

public class CompagniaSharedMobility
{
    private int idSede;
    private String indirizzoSede;
    private ArrayList<Utente> utentiRegistrati;
    private ArrayList<Veicolo> veicoliCompagnia;
    private ArrayList<Affitto> affittiInCorso;

    /****** GETTERS AND SETTERS ******/

    public int getIdSede()
    {
        return idSede;
    }

    private void setIdSede(int idSede)
    {
        this.idSede = idSede;
    }

    public String getIndirizzoSede()
    {
        return indirizzoSede;
    }

    private void setIndirizzoSede(String indirizzoSede)
    {
        this.indirizzoSede = indirizzoSede;
    }

    public List<Utente> getUtentiRegistrati()
    {
        return utentiRegistrati;
    }

    private void setUtentiRegistrati(ArrayList<Utente> utentiRegistrati)
    {
        this.utentiRegistrati = utentiRegistrati;
    }

    public List<Veicolo> getVeicoliCompagnia()
    {
        return veicoliCompagnia;
    }

    private void setVeicoliCompagnia(ArrayList<Veicolo> veicoliCompagnia)
    {
        this.veicoliCompagnia = veicoliCompagnia;
    }

    private List<Affitto> getAffittiInCorso()
    {
        return affittiInCorso;
    }

    private void setAffittiInCorso(ArrayList<Affitto> affittiInCorso)
    {
        this.affittiInCorso = affittiInCorso;
    }


    /****** METHODS ******/

    /*
    - Il metodo registazioneNuovoUtente prende come parametro in input:
        - l'utente che si sta inserendo nel sistema di car sharing
    - Il metodo ritorna "true" oppure "false" a seconda se l'inserimento ha avuto successo oppure no
     */
    public boolean registrazioneNuovoUtente(Utente user)
    {
        return false;
    }

    /*
    - Il metodo affittaVeicolo prende in input come parametro:
        - il veicolo che si sta affittando
        - l'utente che sta affittando il veicolo
        - la durata per la quale questo veicolo si sta affittando (requisito: durata>5 minuti)
    - Il metodo ritorna l'id dell'affitto
     */
    public int affittaVeicolo(Veicolo veicolo, Utente user, int durataAffitto)
    {
        return -1;
    }

    /*
    - Il metodo restituisciVeicolo prende in input come parametro:
        - l'ID dell'affitto in corso al quale si fa riferimento
    - Il metodo ritorna "TRUE" oppure "FALSE" a seconda se l'operazione ha avuto successo oppure no
     */
    public boolean restituisciVeicolo(int idAffitto)
    {
        return false;
    }

    /*
    - Il metodo getVeicoliDisponibili ritorna un ArrayList<Veicolo> contenente tutti i veicoli che
        non sono al momento affittati da qualcuno
     */
    public List<Veicolo> getVeicoliDisponibili()
    {
        return new ArrayList<Veicolo>();
    }

    /*
    - Il metodo getVeicoliDisponibili prende in input come parametro:
        - un oggetto di tipo veicolo
    - Il metodo deve restituire un ArrayList<Veicolo> contenente tutti i veicoli attualmente disponibili
        che sono della stessa tipologia dei veicolo preso in input.
        Esempio: se il parametro veicolo è un automobile, devo ritornare un ArrayList<Veicolo> contenente
            tutti i veicoli che sono anche automobili in output
        Esempio2: se il parametro veicolo è un monopattino, devo ritornare un ArrayList<Veicolo> contenente
            tutti i veicoli che sono anche monopattini in output
     */
    public List<Veicolo> getVeicoliDisponibili(Veicolo veicolo)
    {
        return new ArrayList<Veicolo>();
    }

    /*
    - Il metodo getPosizioneVeicolo prende in input come parametro:
        - il veicolo per il quale si vuole sapere la posizione geografica
    - Il metodo ritorna la posizione del veicolo sotto forma di Stringa
     */
    public String getPosizioneVeicolo(Veicolo veicolo)
    {
        return "";
    }

    /*
    - Il metodo checkIdoneitaAffitto prende in input come parametro:
        - il veicolo che si sta affittando
        - l'utente che sta affittando il veicolo
        - la durata per la quale questo veicolo si sta affittando (requisito: durata>5 minuti)
    - Il metodo ritorna "TRUE" oppure "FASLE" se è possible effettuare o meno l'affitto
     */
    public boolean checkIdoneitaAffitto(Utente utente, Veicolo veicolo, int durata)
    {
        return false;
    }

    /*
    - Il metodo checkIdoneitaPatente prende in input come parametro:
        - l'utente per vedere quali patenti possiede
        - il veicolo per sapere quale patente è richiesta
    - Il metodo ritorna "TRUE" oppure "FALSE" in base a se l'utente possiede la patente richiesta per quel veicolo
     */
    public boolean checkIdoneitaPatente(Utente utente, Veicolo veicolo)
    {
        return false;
    }

    /*
    - Il metodo checkUtenteRegistrato prende in input come parametro:
        - l'utente per vedere se è presente nel sistema di car sharing
    - Il metodo ritorna "TRUE" oppure "FALSE" a seconda se l'utente è registrato o meno
     */
    public boolean checkUtenteRegistrato(Utente utente)
    {
        return false;
    }
}
