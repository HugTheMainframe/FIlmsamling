import java.util.ArrayList;

public class Controller {
    private MovieCollection movieCollection;

    public Controller(){
        this.movieCollection = new MovieCollection();
    }

    public void addMovie(Movie movie){
        movieCollection.addMovie(movie);
    }

    public MovieCollection getMovieCollection(){
        return movieCollection;
    }

    public String searchMovie(String movie){
        return movieCollection.searchMovie(movie);
    }

    @Override
    public String toString(){
        return movieCollection.toString();
    }
}
