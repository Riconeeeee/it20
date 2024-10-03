package Topic_2linkedlist_int;
    
import java.util.Scanner;

public class Main {
    


	public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Linkedlist list = new Linkedlist();

        // Adding elements to the list
         System.out.println("Enter the list of the elements:");
         int item1 = r.nextInt();
         int item2 = r.nextInt();
         int item3 = r.nextInt();
         int item4 = r.nextInt();
         int item5 = r.nextInt();
         
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        
        
        System.out.println("Current Linked List:");
        list.printList();
        
        //Delete      
System.out.println("Enter the Number you want to delete: ");
int item6 = r.nextInt();
list.deleteByValue(item6); // Change this line
System.out.println("Current Linked List after deletion:");
list.printList();

        
        //Move/Swap Pointer
        System.out.println();
System.out.println("Moving/Swapping node from index 1 to index 0");
list.moveNodePointer(1, 0); // Change this line to valid indices
System.out.println("Current Linked List after moving:");
list.printList();
	}

}
