public class Movie {


    private String filmNavn;
    private String filmDirektør;
    private int filmLængde;
    private int filmÅr;
    private String filmGenre;
    private boolean erDenFarvedeEllerEj;

    public Movie(String filmNavn, String filmDirektør, int filmLængde, int filmÅr, String filmGenre, boolean erDenFarvedeEllerEj) {
        this.filmNavn = filmNavn;
        this.filmDirektør = filmDirektør;
        this.filmLængde = filmLængde;
        this.filmÅr = filmÅr;
        this.filmGenre = filmGenre;
        this.erDenFarvedeEllerEj = erDenFarvedeEllerEj;


    }

    public Movie(String filmNavn, String filmDirektør, int filmÅr, int filmGenre, String erDenFarvedeEllerEj, int filmLængde) {
    }

    public String getFilmNavn() {
        return filmNavn;

}

    public String getFilmDirektør() {
        return filmDirektør;
    }

    public int getFilmÅr() {
        return filmÅr;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public boolean isErDenFarvedeEllerEj() {
        return erDenFarvedeEllerEj;
    }

    public int getFilmLængde() {
        return filmLængde;



    }
}




