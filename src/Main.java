import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieCollection collection = new MovieCollection();
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
