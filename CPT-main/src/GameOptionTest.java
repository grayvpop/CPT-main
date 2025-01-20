import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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

        // Act

        // Assert
    }

    @Test
    void testSearchGame() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void testViewGame() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void testViewLibrary() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void testViewUsers() {
        // Arrange
        
        // Act

        // Assert
    }
}
