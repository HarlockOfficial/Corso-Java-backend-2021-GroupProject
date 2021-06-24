package Main;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import House;
import User.User;


public class Book implements Comparable<Book> {

    private final UUID id;
    private  LocalDateTime checkIn;
    private  LocalDateTime checkOut;
    private House house;
    private User user;
    private Feedback feedback;

    public Book(LocalDateTime checkIn, LocalDateTime checkOut, House house, User user, Feedback feedback) {
        id = UUID.randomUUID();
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        this.feedback = feedback;
        setUser(user);
        setHouse(house);
    }
    public Book(UUID id,LocalDateTime checkIn, LocalDateTime checkOut, House house, User user, Feedback feedback) {
        this.id = id;
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        this.feedback = feedback;
        setUser(user);
        setHouse(house);
    }

    public Book(LocalDateTime checkIn, LocalDateTime checkOut, House house) {
        id = UUID.randomUUID();
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        setHouse(house);
        feedback = null;
    }


    public void addFeedback(Feedback feedback) {
        this.feedback = feedback;
    }



    //Getter and Setter
    public UUID getId() { return id; }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Feedback getFeedback() {
        return feedback;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Book b) {
        return id.compareTo(b.getId());
    }

}
