import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();
        String userChoice = "";
        while(!userChoice.equals("4")){
            System.out.println("1. Create a movie");
            System.out.println("2. Overview of collection");
            System.out.println("3. Search by movie title");
            System.out.println("4. Quit");
            userChoice = input.next();
            input.nextLine();
            if(userChoice.equals("1")){
                System.out.println("title");
                String title = input.nextLine();
                System.out.println("director");
                String director = input.nextLine();
                System.out.println("color(yes/no)");
                boolean color = input.next().equalsIgnoreCase("yes");
                System.out.println("Length of film(Min)");
                int lengthInMinutes = input.nextInt();
                System.out.println("year made");
                int yearMade = input.nextInt();
                System.out.println("genre");
                input.nextLine();
                String genre = input.nextLine();
                controller.addMovie(new Movie(title, director, color, lengthInMinutes, yearMade, genre));
            } else if (userChoice.equals("2")){
                System.out.println(controller);
            } else if (userChoice.equals("3")){
                System.out.println("Please type the movie you are searching for: ");
                String search = input.nextLine();
                String movies = controller.searchMovie(search);
                if(movies != null && !movies.equals("")){
                    System.out.println("Here is the movie you searched for: \n" + movies + "\n");
                } else {
                    System.out.println("No movie found... ");
                }

            } else {
                if(!userChoice.equals("4"))
                    System.out.println("Please input a valid input");
            }
        }
    }
}
