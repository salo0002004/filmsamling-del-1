import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MovieCollection collection = new MovieCollection();

        int menuChoice = 0;
        final int SENTINEL = 3;

        Controller controller = new Controller();

        // Create controller outside the loop

        while (menuChoice != SENTINEL) {

            System.out.println("Velkommen til min filmsamnling!");
            System.out.println("1 : Opret en film");
            System.out.println("2 : Vis Collection");
            System.out.println("3 : Afslut");

            menuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (menuChoice == 1) {
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
                }else{
                    controller.addMovie(filmNavn, filmDirektør, filmÅr, filmGenre, erDenFarvede, filmLængde);
                    System.out.println(filmNavn + " Movie er lavet ");
                }
                } else if (menuChoice == SENTINEL) {
                    System.out.println("Du valgte ingen film!");
                    break;
                } else if (menuChoice == 2) {
                    controller.visCollection();
                }
            }
        }
    }

