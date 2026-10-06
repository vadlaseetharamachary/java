public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        int number = 15;

        // 1. if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // 2. if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // 3. else-if ladder
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}