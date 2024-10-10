package topic3_Stack;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		Stack stack = new Stack(5);

       System.out.println ("Enter first element to push :");
       stack.push (sc.nextInt());
       
         System.out.println ("Enter first element to push :");
       stack.push (sc.nextInt());
  
          System.out.println ("Enter first element to push :");
       stack.push (sc.nextInt());
        
        
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Top element is: " + stack.peek());
        System.out.println();
        
        //Use case
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack size after pop: " + stack.size());
        
        System.out.println();
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
	}

}
