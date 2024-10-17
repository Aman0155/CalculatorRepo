import java.util.*;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Menu for operations
        System.out.println("Choose an operation:");
        System.out.println("1: Add");
        System.out.println("2: Subt");
        System.out.println("3: Mul");
        System.out.println("4: Div");

        int choice = sc.nextInt();
        int c;

        switch (choice) {
            case 1: 
                c = a + b;
                System.out.println("Addition is: " + c);
                break;
            case 2: 
                c = a - b;
                System.out.println("Subtraction is: " + c);
                break;
            case 3: 
                c = a * b;
                System.out.println("Multiplication is: " + c);
                break;
            case 4: 
                if (b != 0) {
                    c = a / b;
                    System.out.println("Division is: " + c);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        sc.close(); 
    }
}
