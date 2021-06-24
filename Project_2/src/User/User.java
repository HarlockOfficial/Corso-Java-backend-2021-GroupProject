package User;

import java.util.Objects;
import java.util.UUID;

public class User implements Comparable<User> {
    private final UUID id;
    private final String name;
    private final String surname;
    private String email;


    public User(UUID id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        setEmail(email);
    }

    //overriding costruttore senza mail (mail viene inizializzata a stringa nulla)
    public User(UUID id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
        setEmail("");
    }

    public User(String name, String surname, String email){
        id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        setEmail(email);
    }

    public User(String name, String surname){
        id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        setEmail("");
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
