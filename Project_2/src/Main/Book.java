package Main;

import java.time.LocalDateTime;
import java.util.UUID;
import House;
import User.User;


public class Book {

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



    public void addFeedback(Feedback feedback) {
        setFeedback(feedback);
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

}
