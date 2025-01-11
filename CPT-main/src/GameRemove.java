/**
 * author: nate
 * date: 10/01/2025
 * 200 remove
 */

import java.io.File;
import java.util.Scanner;

 public class GameRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String folderPath = "GamesFolder";
        String fileName = input.nextLine();
        
        boolean result = deleteFile(folderPath, fileName + ".txt");
        
        if (result) {
            System.out.println("Operation completed successfully.");
        } else {
            System.out.println("Operation failed.");
        }

        input.close();
    }


    public static boolean deleteFile(String folderPath, String fileName) {
        File file = new File(folderPath, fileName);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully: " + file.getAbsolutePath()); //getAbsolutePath was searched up from google
                return true;
            } else {
                System.out.println("Failed to delete the file: " + file.getAbsolutePath());
                return false;
            }
        } else {
            System.out.println("File not found: " + file.getAbsolutePath());
            return false;
        }
    }
}