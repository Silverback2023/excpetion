class NegativeException extends Exception {
    public NegativeException(String errorMessage) {
        super(errorMessage);
    }
}

class FactorialCalculator {
    public static int calculateFactorial(int num) throws NegativeException {
        if (num < 0) {
            throw new NegativeException("Number cannot be negative.");
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }1
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            int result = FactorialCalculator.calculateFactorial(num);
            System.out.printf("%d! = %d", num, result);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
