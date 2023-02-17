import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter num1: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter num2: ");
            int num2 = scanner.nextInt();
            
            Calculator obj1 = new Calculator(num1,num2);
            Calculator obj2 = new Calculator(num1,num2);
            Calculator obj3 = new Calculator(num1,num2);
            Calculator obj4 = new Calculator(num1,num2);

            System.out.println("Addition: " + obj1.Add());
            System.out.println("Subtraction: " + obj2.Subtract());
            System.out.println("Multiplication: " + obj3.Multiplication());
            System.out.println("Division: " + obj4.Division());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
