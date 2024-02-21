import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opret = 0;
        int afslut = 2;

        while (opret != afslut) {

            System.out.println("Velkommen til min filmsamnling!");
            System.out.println("1 : Opret en film");
            System.out.println("2 : Afslut");
            opret = scanner.nextInt();

            if (opret == 1) {
                System.out.println("indtast filmens navn: ");
                String filmNavn = scanner.nextLine();
                System.out.println("indtast filmens direktør");
                String filmDirektør = scanner.nextLine();
                System.out.println("indtast filmens længde");
                int filmLængde = scanner.nextInt();
                System.out.println("indtast filmens årtal");
                int filmÅr = scanner.nextInt();
                scanner.nextLine();
                System.out.println("indtast filmens genre");
                String filmGenre = scanner.nextLine();
                System.out.println("Er den farvede, så skriv yes");
                String farvede = scanner.next();
                boolean erDenFarvede = false;
                if (farvede.equals("yes")) {
                    erDenFarvede = true;

                    Movie movie = new Movie(filmNavn, filmDirektør, filmLængde, filmÅr, filmGenre, erDenFarvede);
                    System.out.println(movie.getFilmNavn() + " Movie er lavet ");

                    MovieCollection collection = new MovieCollection();
                    collection.addMovie(movie);
                }
            } else if (opret == afslut) {
                System.out.println("Du valgte ingen film!");
                break;
            }
        }

        scanner.close();
    }
}
