import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieCollection = new ArrayList<>();

    public void addMovie(Movie movie){
        movieCollection.add(movie);
    }
     public ArrayList<Movie> getMovieCollection(){
        return movieCollection;
     }


     @Override
    public String toString() {
         String result = "\n";
         for (Movie movie : movieCollection) {
             result += movie + "\n";
         }
         return result;
     }
}
