import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input your game: ");
        String gameName = input.nextLine();

        String filePath = (gameName + ".txt");

        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("This is the new text being appended.\n");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        input.close();
    }
}
