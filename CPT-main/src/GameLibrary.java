
/**
*author: nate
*date: 09/01/2025
*200 Main
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GameLibrary {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        System.out.print("Please input your game: ");

        String gameName = input.nextLine();

        File f1 = new File("GamesFolder");
        File f2 = new File("GamesFolder/" + gameName + ".txt");

        f1.mkdir();
        f2.createNewFile();

        System.out.println("Folder and file created");

        input.close();
    }
}


// TODO: Add method that allows the user to add their own information and description of the game that they input.

// TODO: Create a search tool for the GamesFolder folder so that games can be easier to find.