package papers.domain.entities;

public class Paper {
    private String title;

    public Paper() {
    }

    public Paper(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}