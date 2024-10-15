package topic_3_stack_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack(9);

        // Push values onto the stack
        for (int j = 0; j < 2; j++) {
            System.out.println("Enter a number (0-9) to push:");
            int value = scanner.nextInt();
            stack.push(value);
        }

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        // Perform operations
        while (true) {
            System.out.println("\nChoose an operation (add, subtract, multiply, divide) or 'exit' to quit:");
            String operation = scanner.next().toLowerCase();
            if (operation.equals("exit")) {
                break;
            }

            int result = performOperation(stack, operation);
            if (result != -1) {
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
    }

    private static int performOperation(Stack stack, String operation) {
        if (stack.size() < 2) {
            System.out.println("Not enough elements in the stack to perform operation.");
            return -1;
        }

        int r = stack.pop();
        int o = stack.pop();
        int result = 0;

        switch (operation) {
            case "add":
                result = r + o;
                break;
            case "subtract":
                result = r - o;
                break;
            case "multiply":
                result = r * o;
                break;
            case "divide":
                if (o == 0) {
                    System.out.println("Cannot divide by zero.");
                    return -1;
                }
                result = r / o;
                break;
            default:
                System.out.println("Invalid operation.");
                return -1;
        }

        stack.push(result);
        return result;
    }
}
