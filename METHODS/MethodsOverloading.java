class MathOperations {

    // 1️⃣ Overloaded add() - integers
    int add(int a, int b) {
        System.out.println("Called add(int, int)");
        return a + b;
    }

    // 2️⃣ Overloaded add() - doubles
    double add(double a, double b) {
        System.out.println("Called add(double, double)");
        return a + b;
    }

    // 3️⃣ Overloaded add() - three integers
    int add(int a, int b, int c) {
        System.out.println("Called add(int, int, int)");
        return a + b + c;
    }

    // 4️⃣ Overloaded add() - varargs
    int add(int... numbers) {
        System.out.println("Called add(int...)");
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }

    // 5️⃣ Overloaded add() - string concatenation
    String add(String a, String b) {
        System.out.println("Called add(String, String)");
        return a + b;
    }

    // 6️⃣ Type promotion example
    double add(long a, float b) {
        System.out.println("Called add(long, float)");
        return a + b;
    }
}

 

public class MethodsOverloading {
    public static void main(String[] args) {
         MathOperations obj = new MathOperations();

        System.out.println("Result = " + obj.add(5, 10));          // int version
        System.out.println("Result = " + obj.add(5.5, 2.2));       // double version
        System.out.println("Result = " + obj.add(1, 2, 3));        // three int version
        System.out.println("Result = " + obj.add(1, 2, 3, 4, 5));  // varargs version
        System.out.println("Result = " + obj.add("Hello ", "Java"));// string version
        System.out.println("Result = " + obj.add(100L, 25.5f));     // long + float version
    }
}
