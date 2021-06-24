package Main;

import java.time.LocalDateTime;
import java.util.UUID;
import House;
import User.User;
import Exception.InvalidStarsRankingException;


public class Book {

    private UUID id;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private House house;
    private User user;
    private Feedback feedback;

    public Book(LocalDateTime checkIn, LocalDateTime checkOut, House house, User user, Feedback feedback) {
        id = UUID.randomUUID();
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        setFeedback(feedback);
        setUser(user);
        setHouse(house);
    }
    public Book(UUID id,LocalDateTime checkIn, LocalDateTime checkOut, House house, User user, Feedback feedback) {
        this.id = id;
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        setFeedback(feedback);
        setUser(user);
        setHouse(house);
    }

    public Book(UUID id,LocalDateTime checkIn, LocalDateTime checkOut, House house, User user) {
        this.id = id;
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        setUser(user);
        setHouse(house);
    }


    public void addFeedback(Feedback feedback) throws InvalidStarsRankingException {
        if (feedback.getStars() <0 || feedback.getStars()>5){
            throw new InvalidStarsRankingException();
        }else{
//aggiungi feedback
        }
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

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
