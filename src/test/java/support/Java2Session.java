package support;

import org.apache.xerces.impl.xs.SchemaSymbols;

import java.util.Scanner;

public class Java2Session {
    public static void main(String[] args) {
        int val = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number: ");

        try {
            val = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Error occured.");
        }

        if (val == 0) {
            System.out.println("The value is 0");
        } else if (val < 0) {
            System.out.println("Val is negative");
        } else if (val > 0) {
            System.out.println("Val is positive.");
        }
    }
}
