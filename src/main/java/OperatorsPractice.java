public class OperatorsPractice {
    // Exercise 1: Calculate shopping cart total
    public static double calculateTotal() {
        // TODO: Calculate and return the total cost of:
        // 2 apples at $0.50 each
        // 1 loaf of bread at $2.25
        // 3 bananas at $0.30 each
        return 0.0; // Replace with your calculation
    }

    // Exercise 2: Write comparison expressions
    public static boolean isEligibleToVote(int age) {
        // TODO: Return true if age is 18 or older
        return false; // Replace with your comparison
    }

    public static boolean isPassingGrade(int grade) {
        // TODO: Return true if grade is 70 or higher
        return false; // Replace with your comparison
    }

    public static boolean isBelowFreezing(double temperature) {
        // TODO: Return true if temperature is below 32°F
        return false; // Replace with your comparison
    }

    // Exercise 3: Check if number is positive
    public static void checkPositive(int number) {
        // TODO: Print "The number is positive" if number is greater than 0
    }

    // Exercise 4: Check if number is even or odd
    public static void checkEvenOdd(int number) {
        // TODO: Print "Even" if number is even, "Odd" if number is odd
    }

    // Exercise 5: Determine age category
    public static String getAgeCategory(int age) {
        // TODO: Return "Child" if age < 13
        // Return "Teen" if age is between 13 and 19
        // Return "Adult" if age is 20 or older
        return ""; // Replace with your code
    }

    // Test your solutions
    public static void main(String[] args) {
        // Exercise 1 Test
        System.out.println("Shopping cart total: $" + calculateTotal());

        // Exercise 2 Tests
        System.out.println("Is 20 eligible to vote? " + isEligibleToVote(20));
        System.out.println("Is 75 a passing grade? " + isPassingGrade(75));
        System.out.println("Is 30°F below freezing? " + isBelowFreezing(30));

        // Exercise 3 Test
        checkPositive(5);

        // Exercise 4 Test
        checkEvenOdd(7);

        // Exercise 5 Test
        System.out.println("Age category for 15: " + getAgeCategory(15));
    }
}