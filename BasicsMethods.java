// Basics.java
// Covers Data Types, Variables, Operators, Conditionals, and Methods

public class BasicsMethods {

    // Method to add two numbers
    static int addNumbers(int a, int b) {
        return a + b;
    }

    //  Method to check if a number is even or odd
    static void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    // Method to find the largest among three numbers
    static int findLargest(int x, int y, int z) {
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;
        else
            return z;
    }

    public static void main(String[] args) {

        // Variables & Data Types
        int age = 20;
        double height = 5.8;
        char grade = 'A';
        boolean isPassed = true;
        String name = "Kannah";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);

        // Operators
        int a = 10, b = 5;
        System.out.println("\n--- Operators ---");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Conditional Statements
        System.out.println("\n--- Conditional Statements ---");
        int num = -3;
        if (num > 0)
            System.out.println(num + " is Positive");
        else if (num < 0)
            System.out.println(num + " is Negative");
        else
            System.out.println("Number is Zero");

        //  Method Calls
        System.out.println("\n--- Methods ---");
        int sum = addNumbers(15, 25);
        System.out.println("Sum of 15 and 25 = " + sum);

        checkEvenOdd(9);

        int largest = findLargest(11, 22, 33);
        System.out.println("Largest number = " + largest);

    
    }
}
