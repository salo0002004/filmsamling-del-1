import java.util.ArrayList;
public class MovieCollection {
    private ArrayList<Movie> collection;
    public MovieCollection(){
        collection= new ArrayList<Movie>();
    }



    // Metode til at tilføje en film til samlingen
    public void addMovie(String filmNavn, String filmDirektør, int filmÅr, int filmGenre, String erDenFarvedeEllerEj, int filmLængde) {
        Movie movie  = new Movie(filmNavn, filmDirektør, filmÅr, filmGenre, erDenFarvedeEllerEj, filmLængde);
        collection.add(movie);

    }
    public ArrayList<Movie> getCollection(){
        return  collection;
    }

    public void addMovie(Movie movie) {
    }
}
