package User;

import Main.Book;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import Exception.InvalidPeriodException;
import Main.House;

public class User implements Comparable<User> {
    private final UUID id;
    private final String name;
    private final String surname;
    private String email;
    private List<Book> books;


    public User(UUID id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        setEmail(email);
        books = new ArrayList<>();
    }

    //overriding costruttore senza mail (mail viene inizializzata a stringa nulla)
    public User(UUID id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
        setEmail("");
        books = new ArrayList<>();
    }

    public User(String name, String surname, String email){
        id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        setEmail(email);
        books = new ArrayList<>();
    }

    public User(String name, String surname){
        id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        setEmail("");
        books = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Book book(House house, ZonedDateTime startDate, ZonedDateTime endDate) throws InvalidPeriodException {
        if(startDate.isAfter(endDate)) throw new InvalidPeriodException();
       else return new Book(startDate, endDate, house);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    @Override
    public int compareTo(User u) {
        // todo return (this.name.compareTo(u.name) && this.surname.compareTo(u.surname));
        return 0;
    }
}
