package movies;

public class Movie {
    String title;
    String genre;
    String priority;

    public Movie() {
    }

    public Movie(String title, String genre, String priority) {
        this.title = title;
        this.genre = genre;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
