import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameOptionTest {
    @Test
    void testCheckGame() {
        // Arrange
        GameOption gameOption = new GameOption("My Game Library");

        // Adding some games to the library
        gameOption.addGame("elden ring");
        gameOption.addGame("Doom");
        gameOption.addGame("The Legend of Zelda: Breath of the Wild");

        String gameExists = "elden ring";
        String gameDoesNotExist = "Minecraft";

        // Act
        boolean result1 = gameOption.checkGame(gameExists); // Check if "elden ring" exists
        boolean result2 = gameOption.checkGame(gameDoesNotExist); // Check if "Minecraft" does not exist

        // Assert
        assertTrue(result1, "Expected 'elden ring' to be in the library.");
        assertFalse(result2, "Expected 'Minecraft' to not be in the library.");
    }


    @Test
    void testGetName() {
        // Arrange
        GameOption gameOption = new GameOption("My Game Library");

        // Act
        String libraryName = gameOption.getName();

        // Assert
        assertEquals("My Game Library", libraryName, "The library name should be 'My Game Library'.");
    }

    @Test
    void testSearchGame() {
        // Arrange
        GameOption gameOption = new GameOption("My Game Library");
        gameOption.addGame("elden ring");
        gameOption.addGame("Doom");
        gameOption.addGame("The Legend of Zelda: Breath of the Wild");

        String gameExists = "elden ring";
        String gameDoesNotExist = "Minecraft";

        // Act
        boolean result1 = gameOption.searchGame(gameExists); // Search for an existing game
        boolean result2 = gameOption.searchGame(gameDoesNotExist); // Search for a non-existing game

        // Assert
        assertTrue(result1, "Expected 'elden ring' to be found in the library.");
        assertFalse(result2, "Expected 'Minecraft' to not be found in the library.");
    }

    @Test
    void testViewGame() {
        // Arrange
        GameOption gameOption = new GameOption("My Game Library");
        gameOption.addGame("elden ring");
        gameOption.addGame("Doom");
        gameOption.addGame("The Legend of Zelda: Breath of the Wild");

        gameOption.addDetails("A challenging open-world RPG.");
        gameOption.addDetails("A first-person shooter.");
        gameOption.addDetails("An action-adventure game set in a fantasy world.");

        String gameExists = "elden ring";
        String gameDoesNotExist = "Minecraft";

        // Act
        boolean result1 = gameOption.viewGame(gameExists); // View details of an existing game
        boolean result2 = gameOption.viewGame(gameDoesNotExist); // View details of a non-existing game

        // Assert
        assertTrue(result1, "Expected 'elden ring' to have details in the library.");
        assertFalse(result2, "Expected 'Minecraft' to not be found in the library.");
    }

    @Test
    void testViewLibrary() {
        // Arrange
        GameOption gameOption = new GameOption("My Game Library");
        
        // Act 
        boolean resultEmpty = gameOption.viewLibrary(); 
        gameOption.addGame("elden ring");
        gameOption.addGame("Doom");
        gameOption.addGame("The Legend of Zelda: Breath of the Wild");

        boolean resultWithGames = gameOption.viewLibrary(); 

        // Assert
        assertFalse(resultEmpty, "Expected library to be empty when no games are added.");
        assertTrue(resultWithGames, "Expected library to display games after adding them.");
    }


    @Test
    void testViewUsers() {
        // Arrange
        GameOption gameOption = new GameOption("My Game Library");

        // Act 
        boolean resultEmpty = gameOption.viewUsers(); 

        gameOption.addUser("alice");
        gameOption.addUser("bob");
        gameOption.addUser("charlie");

        // Act with users in the list
        boolean resultWithUsers = gameOption.viewUsers(); 

        // Assert
        assertFalse(resultEmpty, "Expected user list to be empty when no users are added.");
        assertTrue(resultWithUsers, "Expected user list to display users after adding them.");
    }
}
