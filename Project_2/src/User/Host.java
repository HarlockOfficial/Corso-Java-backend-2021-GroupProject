package User;

import java.util.SortedSet;
import java.util.UUID;

public class Host extends User{
    private boolean isSuperhost;
    // @todo private SortedMap<House, SortedSet<Book>> books;
    // @todo private List<House> houses;

    //se non viene dato nessun altro parametro viene considerato NON superhost e viene creata la mappa delle prenotazioni
    public Host(UUID id, String name, String surname, String email) {
        super(id, name, surname, email);
        isSuperhost = false;
        //@todo books = new SortedMap<>();
    }

    public Host(String name, String surname, String email){
        super(name, surname, email);
        isSuperhost = false;
        //@todo books = new SortedMap<>();
    }

    public Host(String name, String surname){
        super(name, surname);
        isSuperhost = false;
        //@todo books = new SortedMap<>();
    }

    public Host(UUID id, String name, String surname, boolean isSuperhost/* todo , SortedMap<House, SOrtedSet<Book>> books*/){
        super(id, name, surname);
        setSuperhost(isSuperhost);
        // @todo this.books = books;

    }

    public Host(UUID id, String name, String surname/* todo , SortedMap<House, SOrtedSet<Book>> books*/){
        super(id, name, surname);
        // @todo this.books = books;
        //@todo stabilire se è superhost a seconda di quante sono le prenotazioni

    }

    public Host(UUID id, String name, String surname, String email, boolean isSuperhost/* todo , SortedMap<House, SOrtedSet<Book>> books*/){
        super(id, name, surname, email);
        setSuperhost(isSuperhost);
        //@todo this.books = books;
    }
    /*
    public Host(UUID id, String name, String surname, String email todo , SortedMap<House, SOrtedSet<Book>> books){
        super(id, name, surname, email);
        @todo this.books = books;
        stabilire se è superhost a seconda di quante sono le prenotazioni


    }*/

    public void setSuperhost(boolean superhost) {
        isSuperhost = superhost;
    }

    /* @todo public SortedMap<House, SortedSet<Book>> getBooks() {
        return books;
    }

    public void setBooks(SortedMap<House, SortedSet<Book>> books) {
        this.books = books;
    }*/


    @Override
    public String toString() {
        return "Host{" +
                "isSuperhost=" + isSuperhost +
                ", books=" + /* @todo books */+
                '}';
    }

    public void addHouse(){

    }
}
