import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieCollection = new ArrayList<>();

    public void addMovie(Movie movie){
        movieCollection.add(movie);
    }
     public ArrayList<Movie> getMovieCollection(){
        return movieCollection;
     }

     public Movie searchMovie(String movie){
        for (Movie movieSearch : movieCollection){
            if(movieSearch.getTitle().contains(movie.toLowerCase())){
                return movieSearch;
            }
        }return null;
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
