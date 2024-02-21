import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
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
                boolean erDenFarvede =false;
                if (farvede.equals("yes")){
                    erDenFarvede = true;
                }

                Movie movie = new Movie(filmNavn, filmDirektør, filmLængde,filmÅr,filmGenre,erDenFarvede);
                System.out.println(movie.getFilmDirektør());

                MovieCollection collection = new MovieCollection (); collection.addMovie (movie);


            }



        }