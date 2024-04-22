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

    public Movie findMovie(String movie){
        return movieCollection.findMovie(movie);
    }

    public void editMovies(Movie movieTitle, String title, String director, boolean color, int lengthInMinutes,
                           int yearMade, String genre){
        movieCollection.editMovies(movieTitle, title, director, color, lengthInMinutes, yearMade, genre);
    }

    public void removeMovie(Movie movie){
        movieCollection.removeMovie(movie);
    }

    @Override
    public String toString(){
        return movieCollection.toString();
    }
}
