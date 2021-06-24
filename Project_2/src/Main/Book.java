package Main;

import java.time.LocalDateTime;
import java.util.UUID;
import Main.House;
import Main.User;
import Main.Feedback;

public class Book {

    private UUID id;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private House house;
    private User user;
    private Feedback feedback;

    public Book(LocalDateTime checkIn, LocalDateTime checkOut, House house, User user, Feedback feedback) {
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        setFeedback(feedback);
        setId(id);
        setUser(user);
        setHouse(house);
    }

    //Getter and Setter
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUID.randomUUID();
    }

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

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
