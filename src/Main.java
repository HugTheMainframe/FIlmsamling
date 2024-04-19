import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);
        MovieCollection collection = new MovieCollection();
        String userChoice = "";
        while(!userChoice.equals("2")){
            System.out.println("1. Create a movie");
            System.out.println("2. Qut");
            userChoice = input.next();
            input.nextLine();
            if(userChoice.equals("1")){
                System.out.println("title");
                String title = input.nextLine();
                System.out.println("director");
                String director = input.nextLine();
                System.out.println("color(yes/no)");
                boolean color = input.nextBoolean();
                System.out.println("Length of film(Min)");
                int lengthInMinutes = input.nextInt();
                System.out.println("year made");
                int yearMade = input.nextInt();
                System.out.println("genre");
                input.nextLine();
                String genre = input.nextLine();
                collection.addMovie(new Movie(title, director, color, lengthInMinutes, yearMade, genre));
            }
        }
    }
}
