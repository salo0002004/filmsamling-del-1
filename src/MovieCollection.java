import java.util.ArrayList;
public class MovieCollection {
    private ArrayList<Movie> collection;


    public MovieCollection() {
        this.collection = new ArrayList<>();
    }


    // Metode til at tilføje en film til samlingen
    public void addMovie(String filmNavn, String filmDirektør, int filmÅr, String filmGenre, boolean erDenFarvedeEllerEj, int filmLængde) {
        Movie movie = new  Movie(filmNavn, filmDirektør, filmLængde, filmÅr, filmGenre,erDenFarvedeEllerEj);
        collection.add(movie);

    }

    public ArrayList<Movie> getCollection() {
        return collection;
    }


    public void printCollection() {
        for (Movie movie : collection) {
            if (movie != null) {
                System.out.println(movie);
            }

        }
    }
}


