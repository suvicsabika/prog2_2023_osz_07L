public class Main {
    public static void main(String[] args) {
        System.out.println(Movie.movieCounter);

        Movie m1 = new Movie("The Terminator", 1984, 8.1);
        Movie m2 = new Movie("Star Wars V", 1980, 8.7);
        Movie m3 = new Movie("Bloodshot", 2020, -2.0);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println(m2.getScore());
        m2.setScore(11);
        System.out.println(m2.getScore());

        System.out.println(Movie.movieCounter);
    }
}