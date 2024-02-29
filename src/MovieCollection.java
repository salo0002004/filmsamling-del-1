import java.util.ArrayList;
public class MovieCollection {
    ArrayList<Movie> collection;


    public MovieCollection() {
        this.collection = new ArrayList<>();
    }


    // Metode til at tilføje en film til samlingen
    public void addMovie(String filmNavn, String filmDirektør, int filmÅr, String filmGenre, boolean erDenFarvedeEllerEj, int filmLængde) {
        Movie movie = new Movie(filmNavn, filmDirektør, filmLængde, filmÅr, filmGenre, erDenFarvedeEllerEj);
        collection.add(movie);

    }

    public ArrayList<Movie> getCollection() {
        return collection;
    }


    public boolean contains(String filmTitel) {
        for (Movie movie : collection) {
            if (movie.getFilmNavn().contains(filmTitel)) {
                return true;
            }
        }
        return false;
    }

    public String searchMovie(String search) {
        String filmSearchMatches = "";
        for (Movie movie : collection) {
            if (movie.getFilmNavn().toLowerCase().contains((search.toLowerCase()))) {
                filmSearchMatches += "\n" + movie.toString();
            }
        }
        if (!(filmSearchMatches.length() > 0)) {
            return "\nDer var ikke et match;";
        }
        return filmSearchMatches;
    }

}





            







