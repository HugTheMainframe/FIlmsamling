import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieCollection = new ArrayList<>();
    private int count = 0;

    public void addMovie(Movie movie){
        movieCollection.add(movie);
    }
}
