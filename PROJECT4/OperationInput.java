import java.util.Scanner;

public class OperationInput {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a;
        try {
            a = read.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
            return;
        }

        System.out.println("Enter the second number");
        int b;
        try {
            b = read.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
            return;
        }

        System.out.println("Enter the operation");
        String c = read.next();

        if (c.equals("+")) {
            System.out.println("result="+(a + b));
        } else if (c.equals("-")) {
            System.out.println("result="+(a - b));
        } else {
            System.out.println("Bad operation");
        }
    }
}
