package Main;

import java.util.UUID;
import Exception.InvalidStarsRankingException;
import User.User;


public class Feedback {

    private final UUID id;
    private final String title;
    private final String text;
    private  int stars;

    public Feedback(String title, String text, int stars, String title1) throws InvalidStarsRankingException {
        id = UUID.randomUUID();
        this.title = title;
        this.text = text;
        this.stars = stars;
    }

    public Feedback(UUID id,String title, String text, int stars) throws InvalidStarsRankingException {
       this.id = id;
       this.title = title;
       this.text = text;
       this.stars = stars;
    }



    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getText() {
        return text;
    }


    public int getStars() {
        return stars;
    }

    private void setStars(int stars) throws InvalidStarsRankingException{
        if (stars <0 || stars>5){
            throw new InvalidStarsRankingException();
        }
        this.stars = stars;
    }
}