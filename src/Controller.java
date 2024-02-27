public class Controller {
    private MovieCollection collection;

    public Controller() {
        this.collection = new MovieCollection();
    }


    public void addMovie(String filmNavn, String filmDirektør, int filmÅr, String filmGenre, boolean erDenFarvedeEllerEj, int filmLængde) {
        collection.addMovie(filmNavn, filmDirektør, filmÅr, filmGenre, erDenFarvedeEllerEj, filmLængde);
    }

    public String visCollection() {
        return collection.collection.toString();


    }

    public boolean searchMovie(String title) {
        return collection.collection.contains(title);


}

}