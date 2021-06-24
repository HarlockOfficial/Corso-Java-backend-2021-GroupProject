package Project_2.Main;

public class FeedBack{

    private UUID id;
    private String title;
    private String text;
    private int stars;

    public FeedBack(UUID id, String title, String text, int stars) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.stars = stars;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id.randomUUID();
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