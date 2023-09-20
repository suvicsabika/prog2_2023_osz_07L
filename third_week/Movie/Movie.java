public class Movie {
    public static int movieCounter = 0;
    
    private String title; 
    private int year;
    private double score;

    public Movie(String title, int year, double score) {
        this.title = title;
        this.year = year;
        setScore(score);
        movieCounter++;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYeaar() {
        return this.year;
    }

    public double getScore() {
        return this.score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setScore(double newScore) {
        if (newScore > 10.0) {
            this.score = 10.0;
        }
        else if (newScore < 0.0) {
            this.score = 0.0;
        }
        else {
            this.score = newScore;
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%d) - %.2f", this.title, this.year, this.score);
    }
}