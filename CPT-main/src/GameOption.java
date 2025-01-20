/**
 * author: nate
 * date: 13/01/2025
 */

 import java.util.ArrayList;
import java.util.HashSet;

public class GameOption {
    private String name;
    private HashSet<String> games;
    private HashSet<String> users;
    private ArrayList<String> details;

    public GameOption(String name) {
        this.name = name;
        this.games = new HashSet<>();
        this.users = new HashSet<>();
        this.details = new ArrayList<>();
    }


    /**
     * Gets the name of the library.
     * @return The name of the library.
    */
    public String getName() {
        return name;
    }


    /**
     * Adds a game into a list
     * @param game - outputs whether a game is added or already exists
     */
    public void addGame(String game) {
        if (games.contains(game)) {
            System.out.println(game + " already exists within this library");
        } else {
            games.add(game);
            System.out.println(game + " was added");
        }
    }

      /**
     * Views the list of games inputted into the array.
     * @param game - outputs the games inputted by recency.
     */
    public boolean viewLibrary() {
        if (games.isEmpty()) {
            System.out.println("The library is empty.");
            return false;
        } else {
            System.out.println("Games in the library: ");
            for (String game : games) {
                System.out.println("- " + game);
            }
            return true;
        }
    }


      /**
     * Views the list of games and inputted details attached.
     * @param game - outputs the details of the game.
     */
    public boolean viewGame(String game) {
        if (games.contains(game)) {
            System.out.println("Details for game: " + details);
            return true;
        } else {
            System.out.println("Game is not in the library =/");
            return false;
        }
    }

      /**
     *Checks if a game is inside the library. 
     * @param game - outputs whether or not the game inputted exists in the list
     */
    public boolean checkGame(String game) {
        if (games.contains(game)) {
            System.out.println("Game is in library");
            return true;
        } else {
            System.out.println("Game is not in the library =/");
            return false;
        }
    }

      /**
     * Searches the game for a game inside the list
     * @param game - outputs whether or not the game exists inside the list
     */
    public boolean searchGame(String game) {
        if (games.contains(game)) {
            System.out.println(game + " is in the library");
            return true;
        } else {
            System.out.println(game + " cannot be found");
            return false;
        }
    }

      /**
     * Adds a user into a list
     * @param game - outputs the games inputted by recency.
     */
    public void addUser(String user) {
        if (users.contains(user)){
            System.out.println(user + " is taken");
        } else {
            users.add(user);
            System.out.println(user + " registered");
        }
    }

      /**
     * Views the list of users inputted into the list.
     * @param game - outputs the list of users.
     */
    public boolean viewUsers() {
        if (users.isEmpty()) {
            System.out.println("The user list is empty.");
            return false;
        } else {
            System.out.println("Users: ");
            for (String user : users) {
                System.out.println("- " + user);
            }
            return true;
        }
    }

      /**
     * Adds details into a list
     * @param game - outputs the details inputted corresponding the game.
     */
    public void addDetails(String detail) {
        details.add(detail);
        System.out.println("Added description: " + detail);
    }
}