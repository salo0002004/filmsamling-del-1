
import java.util.ArrayList;
public class Controller {
    private MovieCollection collection;

    public Controller() {
        this.collection = new MovieCollection();
    }


    public void addMovie(String filmNavn, String filmDirektør, int filmÅr, String filmGenre, boolean erDenFarvedeEllerEj, int filmLængde) {
        collection.addMovie(filmNavn, filmDirektør, filmÅr, filmGenre, erDenFarvedeEllerEj,  filmLængde);
    }

public void visCollection(){
        collection.printCollection();

}

}