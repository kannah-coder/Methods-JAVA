 import java.util.Arrays;

public class MethodsShowcase {

    //  Instance method with return
    public int add(int a, int b) {
        return a + b;
    }

    

    //  Method overloading (same name, different parameters)
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    //  Method with array parameter
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    //  Recursive method
    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    //  Varargs method (variable number of arguments)
    public int sumVarargs(int... numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        return sum;
    }

    //  Method calling another method
    public void showMathOperations(int x, int y) {
        System.out.println("Add: " + add(x, y));
        System.out.println("Multiply: " + multiply(x, y));
        System.out.println("Factorial of " + x + ": " + factorial(x));
    }

    //  Private method (only accessible inside class)
    private void secretMethod() {
        System.out.println("This is a private method!");
    }

    public static void main(String[] args) {
        MethodsShowcase obj = new MethodsShowcase();

        // Call instance methods
        System.out.println("Addition: " + obj.add(10, 20));
        System.out.println("Multiplication (int): " + obj.multiply(5, 4));
        System.out.println("Multiplication (double): " + obj.multiply(2.5, 4.0));

         

        // Call array method
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + obj.sumArray(nums));

        // Call recursive method
        System.out.println("Factorial of 5: " + obj.factorial(5));

        // Call varargs method
        System.out.println("Sum using varargs: " + obj.sumVarargs(1, 2, 3, 4, 5, 6));

        // Method calling another method
        obj.showMathOperations(3, 7);

        // Private method (accessible only inside class)
        obj.secretMethod();
    }
}
