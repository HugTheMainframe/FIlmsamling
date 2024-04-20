import java.util.Scanner;

public class Userinterface {
    private Controller controller;
    Scanner input = new Scanner(System.in);

    public Userinterface(){
        this.controller = new Controller();
    }

    public void userPrompt(){
        System.out.println("1. Create a movie");
        System.out.println("2. Overview of collection");
        System.out.println("3. Search by movie title");
        System.out.println("4. Quit");
    }

    public void createMovie(){
        System.out.println("Title");
        String title = input.nextLine();
        System.out.println("Director");
        String director = input.nextLine();
        System.out.println("Color(yes/no)");
        boolean color = input.next().equalsIgnoreCase("yes");
        System.out.println("Length of film(Min)");
        int lengthInMinutes = input.nextInt();
        System.out.println("Year made");
        int yearMade = input.nextInt();
        System.out.println("Genre");
        input.nextLine();
        String genre = input.nextLine();
        controller.addMovie(new Movie(title, director, color, lengthInMinutes, yearMade, genre));
    }

    public void viewMovieCollection(){
        System.out.println(controller);
    }

    public void searchMovies(){
        System.out.println("Please type the movie you are searching for: ");
        String search = input.nextLine();
        String movies = controller.searchMovie(search);
        if(movies != null && !movies.equals("")){
            System.out.println("Here is the movie you searched for: \n" + movies);
        } else {
            System.out.println("No movie found... ");
        }
    }

    public void invalidInput(){
        System.out.println("Please input a valid input");
    }

    public void startProgram(){
        String userChoice = "";
        userPrompt();
        while(!userChoice.equals("4")){
            userChoice = input.next();
            input.nextLine();
            if(userChoice.equals("1")){
               createMovie();
            } else if (userChoice.equals("2")){
                viewMovieCollection();
            } else if (userChoice.equals("3")){
                searchMovies();
            } else if (userChoice.equals("4")){
                System.out.println("Quiting...");
            } else {
                invalidInput();
            }
            userPrompt();
        }
    }
}
