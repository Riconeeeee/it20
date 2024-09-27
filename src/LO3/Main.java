package LO3;
import LO3.ItemManager;
import java.util.Scanner;

public class Main {
    public static void main (String [] agrs){
    Scanner scanner = new Scanner(System.in);
            ItemManager list = new ItemManager();

            while (true) {
                System.out.println("Choose an operation: 5) Insert 10) Update 15) Delete 20) Display 25) Find 30) Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    //insert item 
                    case 1:
                        System.out.print("Enter item to insert: ");
                        String itemToInsert = scanner.nextLine();
                        list.insertItem(itemToInsert);
                        break;

                        //update the item 
                    case 2:
                        System.out.print("Enter index to update: ");
                        int updateIndex = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter new item: ");
                        String newItem = scanner.nextLine();
                        list.updateItem(updateIndex, newItem);
                        break;

                        //delete the item 
                    case 3:
                        System.out.print("Enter index to delete: ");
                        int deleteIndex = scanner.nextInt();
                        list.deleteItem(deleteIndex);
                        break;

                        //display the item #
                    case 4:
                        list.displayItems();
                        break;

                        //find the  on the list
                    case 5:
                        System.out.print("Enter item to find: ");
                        String itemToFind = scanner.nextLine();
                        list.findItem(itemToFind);
                        break;

                        //exit the program
                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
                System.out.println();
            }
    }
}