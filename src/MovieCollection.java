import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieCollection = new ArrayList<>();

    public void addMovie(Movie movie){
        movieCollection.add(movie);
    }
     public ArrayList<Movie> getMovieCollection(){
        return movieCollection;
     }

    public String searchMovie(String movie){
        String total = "";
        for(Movie mv : movieCollection){
            if(mv.getTitle().toLowerCase().contains(movie.toLowerCase())){
                total += mv.toString();
            } else {
                total = null;
            }
        }return total;
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
