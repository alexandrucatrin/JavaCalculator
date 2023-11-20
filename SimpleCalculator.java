import java.util.Scanner;

public class SimpleCalculator {

    private static double getOperand(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void performAddition() {
        double num1 = getOperand("Enter the first number: ");
        double num2 = getOperand("Enter the second number: ");
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction() {
        double num1 = getOperand("Enter the first number: ");
        double num2 = getOperand("Enter the second number: ");
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication() {
        double num1 = getOperand("Enter the first number: ");
        double num2 = getOperand("Enter the second number: ");
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision() {
        double num1 = getOperand("Enter the first number: ");
        double num2;
        do {
            num2 = getOperand("Enter the second number (non-zero): ");
            if (num2 == 0) {
                System.out.println("Error: Division by zero. Please enter a non-zero divisor.");
            }
        } while (num2 == 0);

        double result = num1 / num2;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Simple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from 1 to 5.");
            }
        } while (!exit);

        System.out.println("Calculator closed.");
    }

}
