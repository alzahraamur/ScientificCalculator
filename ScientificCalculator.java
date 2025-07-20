import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Scientific Calculator.\n");

        while (continueCalc) {
            System.out.println("=== Scientific Calculator ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Logarithm base e (ln)");
            System.out.println("11. Logarithm base 10");
            System.out.println("12. Absolute Value");
            System.out.println("13. Round");
            System.out.println("14. Ceil");
            System.out.println("15. Floor");
            System.out.println("16. Min between two numbers");
            System.out.println("17. Max between two numbers");
            System.out.println("18. Exit");
            System.out.print("Choose an operation (1-18): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: performAddition(scanner); break;
                case 2: performSubtraction(scanner); break;
                case 3: performMultiplication(scanner); break;
                case 4: performDivision(scanner); break;
                case 5: performPower(scanner); break;
                case 6: performSquareRoot(scanner); break;
                case 7: performSine(scanner); break;
                case 8: performCosine(scanner); break;
                case 9: performTangent(scanner); break;
                case 10: performLog(scanner); break;
                case 11: performLog10(scanner); break;
                case 12: performAbsolute(scanner); break;
                case 13: performRound(scanner); break;
                case 14: performCeil(scanner); break;
                case 15: performFloor(scanner); break;
                case 16: performMin(scanner); break;
                case 17: performMax(scanner); break;
                case 18:
                    continueCalc = false;
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Operations
    public static void performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a + b));
    }

    public static void performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a - b));
    }

    public static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a * b));
    }

    public static void performDivision(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double a = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double b = scanner.nextDouble();
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void performPower(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println("Result: " + Math.pow(base, exponent));
    }

    public static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error: Cannot take square root of negative number.");
        } else {
            System.out.println("Result: " + Math.sqrt(num));
        }
    }

    public static void performSine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.println("Result: " + Math.sin(radians));
    }

    public static void performCosine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.println("Result: " + Math.cos(radians));
    }

    public static void performTangent(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.println("Result: " + Math.tan(radians));
    }

    public static void performLog(Scanner scanner) {
        System.out.print("Enter number for natural log: ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.log(num));
    }

    public static void performLog10(Scanner scanner) {
        System.out.print("Enter number for log base 10: ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.log10(num));
    }

    public static void performAbsolute(Scanner scanner) {
        System.out.print("Enter number for absolute value: ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.abs(num));
    }

    public static void performRound(Scanner scanner) {
        System.out.print("Enter number to round: ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.round(num));
    }

    public static void performCeil(Scanner scanner) {
        System.out.print("Enter number to apply ceil: ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.ceil(num));
    }

    public static void performFloor(Scanner scanner) {
        System.out.print("Enter number to apply floor: ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.floor(num));
    }

    public static void performMin(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + Math.min(a, b));
    }

    public static void performMax(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + Math.max(a, b));
    }
}
