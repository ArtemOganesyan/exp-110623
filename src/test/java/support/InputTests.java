package support;

import java.util.Scanner;
import java.util.function.DoubleConsumer;

public class InputTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type operand 1: ");
        String op1 = scanner.nextLine();
        System.out.println("Type operation (+, -, *, /): ");
        String operation = scanner.nextLine();
        System.out.println("Type operand 2: ");
        String op2 = scanner.nextLine();

        double result = 0;

        if (operation.equals("/") && op2.equals("0")) {
            System.out.println("Error: division by zero");
            return;
        } else {
            result = calculate(op1, op2, operation);
        }

        printResult(result);
    }

    static double calculate(String op1, String op2, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = Double.parseDouble(op1) + Double.parseDouble(op2);
                break;
            case "-":
                result = Double.parseDouble(op1) - Double.parseDouble(op2);
                break;
            case "*":
                result = Double.parseDouble(op1) * Double.parseDouble(op2);
                break;
            case "/":
                result = Double.parseDouble(op1) / Double.parseDouble(op2);
                break;
            default:
                System.out.println("Unsupported operation");
                break;
        }
        return result;
    }

    static void printResult(double result) {
        System.out.println("The result: " + result);
    }
}
