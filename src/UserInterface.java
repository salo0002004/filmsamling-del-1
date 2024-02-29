import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();



    /* public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.startProgram();*/
        public void startProgram() {


            MovieCollection collection = new MovieCollection();

            int menuChoice = 0;
            final int SENTINEL = 4;


            // Create controller outside the loop

            while (menuChoice != SENTINEL) {
                System.out.println("Velkommen til min filmsamnling!");
                System.out.println("1 : Opret en film");
                System.out.println("2 : Vis Collection");
                System.out.println("3 : Søg film");
                System.out.println("4 : Afslut");

                menuChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                if (menuChoice == 1) {
                    addMovie();
                } else if (menuChoice == SENTINEL) {
                    afslutCollection();
                } else if (menuChoice == 2) {
                    visCollection();
                } else if (menuChoice == 3) {
                    søgFilm();

                }
            }

        }
            public void addMovie() {
                System.out.println("indtast filmens navn: ");
                String filmNavn = scanner.nextLine();
                System.out.println("indtast filmens direktør");
                String filmDirektør = scanner.nextLine();
                System.out.println("indtast filmens længde");
                int filmLængde = scanner.nextInt();
                System.out.println("indtast filmens årtal");
                int filmÅr = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.println("indtast filmens genre");
                String filmGenre = scanner.nextLine();
                System.out.println("Er den farvede, så skriv yes");
                String farvede = scanner.next();
                boolean erDenFarvede = false;
                if (farvede.equals("yes")) {
                    erDenFarvede = true;
                    controller.addMovie(filmNavn, filmDirektør, filmÅr, filmGenre, erDenFarvede, filmLængde);
                    System.out.println(filmNavn + " Movie er lavet ");
                } else {
                    controller.addMovie(filmNavn, filmDirektør, filmÅr, filmGenre, erDenFarvede, filmLængde);
                    System.out.println(filmNavn + " Movie er lavet ");
                }
            }

                public void afslutCollection(){
                    System.out.println("Du valgte ingen film!");

            }
            public void visCollection(){
                controller.visCollection();

            }

//            public void søgFilm(){
//                System.out.println("Søg efter en specifik film: ");
//                System.out.println("Indtast filmens navn: ");
//                String movieName = scanner.nextLine();
//                if (controller.searchMovie(movieName)) {
//                    System.out.println("Filmen findes i din filmsamling." + controller.visCollection());
//                } else {
//                    System.out.println("Filmen blev ikke fundet i din filmsamling.");
//                }

            public void søgFilm(){
                    System.out.println("indtast et eller flere bogstaver af en filmtitel: ");
                    String searchWord = scanner.next();
                    ArrayList<Movie> movieMatches = controller.searchMovie(searchWord);
                    if(!(movieMatches.size() > 0)) {
                        System.out.println("\n Der var desværre ikke et match.\n");
                    } else {
                        for (Movie m : movieMatches) {
                            System.out.println("\n" + m);
                        }
                    }
                }

        }





