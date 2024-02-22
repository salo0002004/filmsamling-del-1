
import java.util.ArrayList;
public class Controller {
    private MovieCollection collection;

    public Controller() {
        collection = new MovieCollection();
    }

    public void addMovie(String filmNavn, String filmDirektør, int filmÅr, int filmGenre, String erDenFarvedeEllerEj, int filmLængde) {
        collection.addMovie(filmNavn, filmDirektør, filmÅr, filmGenre, erDenFarvedeEllerEj, filmLængde);
    }
}