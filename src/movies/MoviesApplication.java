package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

        public static void movieApp() {
            boolean looping = true;
            Movie[] movieArray = MoviesArray.findAll();
            Input sc = new Input();
            while (looping){
                System.out.println("Select A Movie");
                System.out.println("0 - Exit");
                System.out.println("1 - See all movies");
                System.out.println("2 - Musical movies");
                System.out.println("3 - Drama movies");
                System.out.println("4 - Horror movies");
                System.out.println("5 - Sci-fi movies");
                System.out.println("6 - Add A Movie");
                int num = sc.getIntSec(0, 6);
                switch (num) {
                    case (0):
                        System.out.println("Do you want to quit?");
                        sc.clear();
                        boolean confirm = sc.yesNo();
                        if (confirm) {
                            System.out.println("BYE...");
                            looping = false;
                            break;
                        } else {
                            System.out.println("LOADING...");
                            break;
                        }
                    case (1):
                        for (Movie movie : movieArray) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                        break;
                    case (2):
                        for (Movie movie : movieArray) {
                            if (movie.getCategory().equals("musical")) {
                                System.out.println(movie.getName() + " --- " + movie.getCategory());
                            }
                        }
                        break;
                    case (3):
                        for (Movie movie : movieArray) {
                            if (movie.getCategory().equals("drama")) {
                                System.out.println(movie.getName() + " --- " + movie.getCategory());
                            }
                        }
                        break;
                    case (4):
                        for (Movie movie : movieArray) {
                            if (movie.getCategory().equals("horror")) {
                                System.out.println(movie.getName() + " --- " + movie.getCategory());
                            }
                        }
                        break;
                    case (5):
                        for (Movie movie : movieArray) {
                            if (movie.getCategory().equals("sci-fi")) {
                                System.out.println(movie.getName() + " --- " + movie.getCategory());
                            }
                        }
                        break;
                    case(6):
                        sc.clear();
                        System.out.println("Enter Movie Title");
                        String title = sc.getString();
                        System.out.println("Enter Movie Genre");
                        String genre = sc.getString().toLowerCase();
                        Movie addMe = new Movie(title,genre);
                        movieArray = addMovie(movieArray, addMe);
                        System.out.println("Confirm Added Movie?");
                        boolean answer = sc.yesNo();
                        if (answer) {
                            for (Movie movie : movieArray) {
                                System.out.println(movie.getName() + " --- " + movie.getCategory());
                            }
                            break;
                        } else {
                            System.out.println("REFRESHING");
                            break;
                        }
                    default:
                        System.out.println("LOADING...");
                        break;
                }
            }
        }

        private static Movie[] addMovie(Movie[] movies, Movie movie){
            movies = Arrays.copyOf(movies, movies.length + 1);
            movies[movies.length - 1] = movie;
            return movies;
        }

        public static void main(String[] args) {
            movieApp();
        }
    }
