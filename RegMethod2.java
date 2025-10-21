public class RegMethod2 {
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int maximum = max(10, 20);
        System.out.println("Maximum = " + maximum);
    }
}
