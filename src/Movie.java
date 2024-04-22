public class Movie {
    private String title;
    private String director;
    private boolean color;
    private int lengthInMinutes;
    private int yearMade;
    private String genre;

    public Movie(String title, String director, boolean color,
                 int lengthInMinutes, int yearMade, String genre){
        this.title = title;
        this.director = director;
        this.color = color;
        this.lengthInMinutes = lengthInMinutes;
        this.yearMade = yearMade;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public boolean getColor(){
        return color;
    }

    public int getLengthInMinutes(){
        return lengthInMinutes;
    }

    public int getYearMade(){
        return yearMade;
    }

    public String getGenre(){
        return genre;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public void setColor(boolean color){
        this.color = color;
    }

    public void setLengthInMinutes(int lengthInMinutes){
        this.lengthInMinutes = lengthInMinutes;
    }

    public void setYearMade(int yearMade){
        this.yearMade = yearMade;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

@Override
    public String toString(){
        String movieOutput = "";
        movieOutput += "Title: " + getTitle() + "\nDirector: " + getDirector();
        if (getColor() == true){
            movieOutput += "\nColor: Is in color";
        } else {
            movieOutput += "\nColor: is not in color";
        }
        movieOutput += "\nLength: " + lengthInMinutes + " Min" +
                "\nYear: " + yearMade + "\nGenre: " + genre;
        return movieOutput;

}
}
