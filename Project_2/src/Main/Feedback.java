package Main;

import java.util.UUID;

public class Feedback {

    private UUID id;
    private String title;
    private String text;
    private int stars;

    public Feedback(String title, String text, int stars) {
        setId(id);
        setStars(stars);
        setText(text);
        setTitle(title);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}