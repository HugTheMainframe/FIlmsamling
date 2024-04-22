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
        System.out.println("4. Edit movie");
        System.out.println("5. Quit");
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
        if(!movies.equals("")){
            System.out.println("Here is the movie you searched for: \n\n" + movies);
        } else {
            System.out.println("No movie found... ");
        }
    }

    public void editMovies() {
        System.out.println("Please type in the movie you want to edit: ");
        String search = input.nextLine();
        Movie movieToEdit = controller.findMovie(search);
        if (!movieToEdit.getTitle().isEmpty()){
            System.out.println("1. Want to edit title: ");
            System.out.println("2. Want to edit director: ");
            System.out.println("3. Want to edit isInColor: ");
            System.out.println("4. Want to edit length of film: ");
            System.out.println("5. Want to edit year made: ");
            System.out.println("6. Want to edit genre: ");
            System.out.println("7. Want to edit the whole movie info: ");
            System.out.println("8. Want to return to menu: ");
            String editChoice = input.nextLine();
            switch (editChoice) {
                case "1" -> movieToEdit.setTitle(input.nextLine());
                case "2" -> movieToEdit.setDirector(input.nextLine());
                case "3" -> movieToEdit.setColor(input.next().equalsIgnoreCase("yes"));
                case "4" -> movieToEdit.setLengthInMinutes(input.nextInt());
                case "5" -> movieToEdit.setYearMade(input.nextInt());
                case "6" -> movieToEdit.setGenre(input.nextLine());
                case "7" -> {
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
                    controller.editMovies(movieToEdit, title, director, color, lengthInMinutes, yearMade, genre);
                }
                case "8" -> startProgram();
                default -> {
                    invalidInput();
                    editMovies();
                }
            }
        }
    }

    public void invalidInput(){
        System.out.println("Please input a valid input");
    }

    public void startProgram(){
        String userChoice = "";
        userPrompt();
        while(true){
            userChoice = input.next();
            input.nextLine();
            if(userChoice.equals("1")){
               createMovie();
            } else if (userChoice.equals("2")){
                viewMovieCollection();
            } else if (userChoice.equals("3")){
                searchMovies();
            } else if (userChoice.equals("4")){
                editMovies();
            } else if (userChoice.equals("5")){
                System.out.println("Quiting...");
                break;
            } else {
                invalidInput();
            }
            userPrompt();
        }
    }
}
