/**
 * author: nate
 * date: 13/01/2025
 */

 import java.util.Scanner;

 public class GameMain {
 
     public static void clearScreen() {
         System.out.print("\033[H\033[2J");
         System.out.flush();
     }
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         GameOption library = new GameOption("Welcome to the GamesLibrary");
 
         System.out.println("Hello please answer the following questions");
 
         System.out.print("Please add a game: ");
         String gameAdd = input.nextLine();
         library.addGame(gameAdd);
 
         System.out.print("Please create a user: ");
         String userAdd = input.nextLine();
         library.addUser(userAdd);
 
         clearScreen();
         
         boolean list = true;
 
         while (list) {
             System.out.println(library.getName() + ", please enjoy your time,");
             System.out.println("1. View List");
             System.out.println("2. View users");
             System.out.println("3  game descriptions");
             System.out.println("4. Search for a game");
             System.out.println("5. Add details for a game");
             System.out.println("6. Add new user");
             System.out.println("7. Add game to library");
             System.out.println("8. Exit");
             System.out.print("Select option: ");
 
             int option = input.nextInt();
             input.nextLine();
 
             switch (option) {
                 case 1:
                     clearScreen();
                     library.viewLibrary();
                     break;
 
                 case 2:
                     clearScreen();
                     library.viewUsers();
                     break;
 
                 case 3:
                     clearScreen();
                     System.out.print("Enter game name: ");
                     String gameName = input.nextLine();
                     library.viewGame(gameName);
                     break;
 
                 case 4:
                     clearScreen();
                     System.out.print("Enter game name: ");
                     String searchGameName = input.nextLine();
                     library.searchGame(searchGameName);
                     break;
 
                 case 5:
                     clearScreen();
                     System.out.print("Enter game name: ");
                     String gameName2 = input.nextLine();
                     boolean isFound = library.checkGame(gameName2);
                     if (isFound == true) {
                         System.out.print("Enter a description: ");
                         String details = input.nextLine();
                         library.addDetails(details);
                         break;
                     } else {
                         break;
                     }
 
                 case 6:
                     clearScreen();
                     System.out.print("input new user: ");
                     String additionalUser = input.nextLine();
                     library.addUser(additionalUser);
                     break;
 
                 case 7:
                     clearScreen();
                     System.out.print("What game would you like to add: ");
                     String additionalGame = input.nextLine();
                     library.addGame(additionalGame);
                     break;
                     
                 case 8:
                     clearScreen();
                     System.out.print("I hope you had an amazing time. :)");
                     list = false;
                     break;
 
                 default:
                     System.out.println("Invalid option."); 
                     break;   
 
             }
         }
 
         input.close();
 
     }
 }