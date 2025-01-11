/**
 * author: nate
 * date: 11/01/2025
 * 200 replace
 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GamesReplace {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input your game: ");
        String gameName = input.nextLine();

        System.out.print("what would you like to write: ");
        String replace = input.nextLine();

        try {
            FileWriter writer = new FileWriter(gameName, true);
            writer.write(replace);
            writer.close();
    
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        input.close();
    }
}
