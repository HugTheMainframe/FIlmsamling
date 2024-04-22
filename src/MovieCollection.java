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
                total += mv.toString() + "\n";
            }
        }return total;
    }

    public Movie findMovie(String movie){
        for(Movie mv : movieCollection){
            if(mv.getTitle().equalsIgnoreCase(movie.toLowerCase())){
                return mv;
            }
        } return null;
    }

    public void editMovies(Movie movieTitle, String title, String director, boolean color, int lengthInMinutes,
                           int yearMade, String genre){
        movieTitle.setTitle(title);
        movieTitle.setDirector(director);
        movieTitle.setColor(color);
        movieTitle.setLengthInMinutes(lengthInMinutes);
        movieTitle.setYearMade(yearMade);
        movieTitle.setGenre(genre);
    }

    public void removeMovie(Movie movie){
        movieCollection.remove(movie);
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
