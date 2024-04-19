import java.util.ArrayList;

public class Controller {
    MovieCollection movieCollection;

    public Controller(){
        this.movieCollection = new MovieCollection();
    }

    public void addMovie(Movie movie){
        movieCollection.addMovie(movie);
    }

    public MovieCollection getMovieCollection(){
        return movieCollection;
    }

    @Override
    public String toString(){
        return movieCollection.toString();
    }
}
