import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void addMovie(){
        //Arrange
        MovieCollection movieCollection = new MovieCollection();
        Movie movie = new Movie("007", "james", true, 90, 1998, "Action");
        movieCollection.addMovie(movie);

        //Act
        int actualValue = movieCollection.getMovieCollection().size();

        //Assert
        int expectedValue = 1;
        Assertions.assertEquals(expectedValue, actualValue);

    }

    @Test
    void addMovies(){
        //Arrange
        MovieCollection movieCollection = new MovieCollection();
        Movie movie1 = new Movie("007", "james", true, 90, 1998, "Action");
        Movie movie2 = new Movie("bob", "ko", false, 23, 2002, "Comedy");
        Movie movie3 = new Movie("Party!", "hufman", true, 77, 2020, "Romance");
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);
        movieCollection.addMovie(movie3);

        //Act
        int actualValue = movieCollection.getMovieCollection().size();

        //Assert
        int expectedValue = 3;
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void searchZeroMovie(){
        //Arrange
        MovieCollection movieCollection = new MovieCollection();
        Movie movie = new Movie("bob", "james", true, 90, 1998, "Action");
        movieCollection.addMovie(movie);

        //Act
        String actualValue = movieCollection.searchMovie("gog");

        //Assert
        String expectedValue = "";
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void searchOneMovie(){
        //Arrange
        MovieCollection movieCollection = new MovieCollection();
        Movie movie = new Movie("bob", "james", true, 90, 1998, "Action");
        movieCollection.addMovie(movie);

        //Act
        String actualValue = movieCollection.searchMovie("bob");


        //Assert
        Movie test = new Movie("bob", "james", true, 90, 1998, "Action");
        String expectedValue = test.toString() + "\n";

        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    void searchMoreMovies(){
        //Arrange
        MovieCollection movieCollection = new MovieCollection();
        Movie movie1 = new Movie("bob", "james", true, 90, 1998, "Action");
        Movie movie2 = new Movie("boo", "ko", false, 23, 2002, "Comedy");
        Movie movie3 = new Movie("bee", "hufman", true, 77, 2020, "Romance");
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);
        movieCollection.addMovie(movie3);

        //Act
        //for getting the numbers of movies in the moviecollection object
        int actualValue = movieCollection.getMovieCollection().size();
        //for seeing if it will give all three movie objects as it should when searching for a common char
        String actualOutput = movieCollection.searchMovie("b");

        //Assert
        int expectedValue = 3;
        Movie movie1test = new Movie("bob", "james", true, 90, 1998, "Action");
        Movie movie2test = new Movie("boo", "ko", false, 23, 2002, "Comedy");
        Movie movie3test = new Movie("bee", "hufman", true, 77, 2020, "Romance");
        String expectedOutput = movie1test.toString() + "\n" + movie2test.toString() + "\n" + movie3test.toString() + "\n";

        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }


}