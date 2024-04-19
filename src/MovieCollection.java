public class MovieCollection {
    Movie[] movieCollection = new Movie[5];
    private int count = 0;

    public void addMovie(Movie movie){
        movieCollection[count] = movie;
        count++;
    }
}
