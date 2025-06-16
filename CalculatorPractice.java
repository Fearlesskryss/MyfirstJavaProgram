import java.util.Scanner;

public class CalculatorPractice {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Get the first number
      System.out.print("Enter first number: ");
      double num1 = scanner.nextDouble();

      // Get the second number
      System.out.print("Enter second number: ");
      double num2 = scanner.nextDouble();

      // Ask for the operation
      System.out.print("Choose an operation (+, -, *, /): ");
      char operator = scanner.next().charAt(0);

      double result;

      // Perform calculation
      if (operator == '+') {
         result = num1 + num2;
      } else if (operator == '-') {
         result = num1 - num2;
      } else if (operator == '*') {
         result = num1 * num2;
      } else if (operator == '/') {
         if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return;
         }
         result = num1 / num2;
      } else {
         System.out.println("Invalid operator!");
         return;
      }

      // Display result
      System.out.println("Result: " + result);
   }
}

